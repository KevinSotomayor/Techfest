package upv.techfest.taller.ui.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import upv.techfest.taller.R;


public class HolaMundoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText(getString(R.string.hola_mundo));
        setContentView(text);

    }
}
