package com.tolgaduran.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class GenresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genres);

        ListView listViewGenre=(ListView)findViewById(R.id.activity_genres);

        List<String> listGenre=new ArrayList<String>();
        listGenre.add("Psychedelic");
        listGenre.add("Goa");
        listGenre.add("Rock\'n Roll");
        listGenre.add("Jazz");
        listGenre.add("Pop");

        ArrayAdapter<String>  arrayAdapterGenre=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                listGenre);

        listViewGenre.setAdapter(arrayAdapterGenre);
    }
}
