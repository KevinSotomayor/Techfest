package upv.techfest.taller.ui.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import upv.techfest.taller.R;
import upv.techfest.taller.ui.Adapters.BasicsAndroidAdapter;

/**
 * Created by Kevin on 12/10/15.
 */
public class BasicsAndroid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_basics_android);

        //personalizacion del actionbar
        setUpActionBar();

        ListView lista_basics = (ListView)findViewById(R.id.lista_basics);
        ArrayList<String> list_items = new ArrayList<String>();
        list_items.add("Hola Mundo"); // texto con codigo
        list_items.add("Interfaz de usuario"); //layouts e interfaz
        list_items.add("Componentes básicas"); //edittext, botones, radiogroups, etc.
        list_items.add("Paso de pantalla"); //paso de pantalla con un texto.
        list_items.add("Controles de selección"); //listas y menús.

        BasicsAndroidAdapter adapter = new BasicsAndroidAdapter(this, R.layout.lv_item_basics, list_items);
        lista_basics.setAdapter(adapter);

        lista_basics.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:

                        break;
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;

                }
            }
        });

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setUpActionBar(){
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle(getString(R.string.mas_alla_title));
    }

}
