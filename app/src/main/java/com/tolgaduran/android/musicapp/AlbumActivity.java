package com.tolgaduran.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        ListView listViewAlbum=(ListView)findViewById(R.id.activity_album);

        List<String> listAlbum=new ArrayList<String>();
        listAlbum.add("Fat Of The Land");
        listAlbum.add("Sehnsucht");
        listAlbum.add("Summer Time");
        listAlbum.add("All Is Vanity");
        listAlbum.add("Another Man\'s Wife");
        listAlbum.add("Away All Obstacles");

        ArrayAdapter<String> arrayAdapterAlbum=new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                listAlbum);

        listViewAlbum.setAdapter(arrayAdapterAlbum);
    }
}
