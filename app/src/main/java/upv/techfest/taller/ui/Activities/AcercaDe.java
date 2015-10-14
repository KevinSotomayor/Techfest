package upv.techfest.taller.ui.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import upv.techfest.taller.R;
import upv.techfest.taller.model.Utils.TechfestTypefaces;


public class AcercaDe extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.a_acercade);

        TextView title1 = (TextView)findViewById(R.id.a_acercade_title1);
        TextView title2 = (TextView)findViewById(R.id.a_acercade_title2);

        title1.setTypeface(TechfestTypefaces.getFont(getAssets(), 4));
        title2.setTypeface(TechfestTypefaces.getFont(getAssets(), 3));

    }
}
