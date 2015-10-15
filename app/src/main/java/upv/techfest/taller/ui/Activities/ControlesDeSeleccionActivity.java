package upv.techfest.taller.ui.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import upv.techfest.taller.R;


public class ControlesDeSeleccionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.a_controles_de_seleccion);

        //identificamos la lista
        ListView lista = (ListView)findViewById(R.id.lista_controlesDeSeleccion);

        //rellenamos la lista
        ArrayList<String> datosLista = new ArrayList<String>();
        for(int i = 0 ; i<20; i++){
            datosLista.add("Dato de lista " + i);
        }

        //adaptador para crear una lista
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,datosLista);

        //almacenamos los datos en la lista
        lista.setAdapter(adapter);


        //escuchador de la lista.
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ControlesDeSeleccionActivity.this, "Elemento seleccionado: " + position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

