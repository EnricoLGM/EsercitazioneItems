package com.example.esercitazioneitems;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    String film[]={"Spiderman", "Titanic", "Balle spaziali"};
    ListView listaFilm;
    Button bottoneEsci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaFilm=(ListView)findViewById(R.id.listaFilm);
        bottoneEsci=(Button)findViewById(R.id.bottoneEsci);
        ArrayAdapter<String> adapterFilm=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, film);
        listaFilm.setAdapter(adapterFilm);
        bottoneEsci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Stai per uscire", Toast.LENGTH_LONG).show();
                Intent i=new Intent(getApplicationContext(), Start.class);
                startActivity(i);
            }
        });
        //onitamclicklistner da utilizzare sulla lista
        listaFilm.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String titolo=(String)listaFilm.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), titolo, Toast.LENGTH_LONG).show();
                //istanzia l'activity e la avvia
                Intent i=new Intent(getApplicationContext(), FilmInfo.class);
                i.putExtra("title", titolo);
                startActivity(i);
                Log.d("click", "prova " + titolo);
            }
        });
    }
}