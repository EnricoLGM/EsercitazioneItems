package com.example.esercitazioneitems;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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
            }
        });
        //onitamclicklistner da utilizzare sulla lista
        //listaFilm.setOnItemClickListener(new View.OnClickListener());
    }
}