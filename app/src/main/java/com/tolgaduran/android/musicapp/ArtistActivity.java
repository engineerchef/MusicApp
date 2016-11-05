package com.tolgaduran.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        ListView listViewArtist = (ListView)findViewById(R.id.activity_artist);

        List<String> listArtist= new ArrayList<String>();
        listArtist.add("Prodigy");
        listArtist.add("Rammstein");
        listArtist.add("Bryan Adams");
        listArtist.add("Baxter Woods");
        listArtist.add("Kickoff Return");
        listArtist.add("Point 175");

        ArrayAdapter<String> arrayAdapterArtist=new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                listArtist);

        listViewArtist.setAdapter(arrayAdapterArtist);
    }
}
