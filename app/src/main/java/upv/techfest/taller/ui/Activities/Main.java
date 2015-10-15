package upv.techfest.taller.ui.Activities;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import upv.techfest.taller.R;
import upv.techfest.taller.model.Utils.TechfestTypefaces;

public class Main extends AppCompatActivity {
    static final int EASTER_EGG_PULSE = 10;

    private AnimationDrawable animationDrawable;

    private int taps = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //layout de botones ocultos:
        final View layout = (View)findViewById(R.id.buttons_layout);

        //identificar el texto y poner un typefaces propio
        TextView hello_world = (TextView)findViewById(R.id.hello_world_tv);
        hello_world.setTypeface(TechfestTypefaces.getFont(getAssets(), 4));


        final ImageView andy = (ImageView)findViewById(R.id.andy_iv);

        //new instance de una animación
        animationDrawable = (AnimationDrawable)andy.getDrawable();

        //espera unos segundos y te saluda
        andy.postDelayed(new Runnable() {
            @Override
            public void run() {
                animationDrawable.start();
            }
        }, 2500);


        andy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(taps==EASTER_EGG_PULSE/2){
                    Toast.makeText(Main.this, "Vamos.. Estás a punto de descubrir más!", Toast.LENGTH_SHORT).show();
                } else if(taps==EASTER_EGG_PULSE-3){
                    Toast.makeText(Main.this, "Ya casi...", Toast.LENGTH_SHORT).show();
                } else if(taps==EASTER_EGG_PULSE-1){
                    Toast.makeText(Main.this, "1 más y...", Toast.LENGTH_SHORT).show();

                }

                if(taps == EASTER_EGG_PULSE){

                    layout.animate()
                            .translationY(layout.getHeight() / 2)
                            .setDuration(1000)
                            .alpha(1.0f)
                            .setListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationStart(Animator animation) {
                                    layout.setVisibility(View.VISIBLE);
                                }
                            });

                    animationDrawable.stop();
                }
                taps++;
            }
        });


        //Buttons
        Button compartir = (Button)findViewById(R.id.compartir_button);
        compartir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                share();
            }
        });

        Button mas_alla = (Button)findViewById(R.id.mas_alla_button);
        mas_alla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                masAlla();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            startActivity(new Intent(Main.this, AcercaDe.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void share(){
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        String shareBody = getString(R.string.share_techfest);
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(sharingIntent, getString(R.string.share_tittle)));
    }

    private void masAlla(){
        /** A completar **/
        Intent intent = new Intent(Main.this, BasicsAndroid.class);
        startActivity(intent);
    }
}
