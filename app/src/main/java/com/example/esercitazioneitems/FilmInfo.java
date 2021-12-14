package com.example.esercitazioneitems;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FilmInfo extends AppCompatActivity {

    TextView titolo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film_info);
        titolo=(TextView)findViewById(R.id.titolo);
        Intent i = getIntent();
        String title = i.getStringExtra("title");
        titolo.setText(title);
    }
}