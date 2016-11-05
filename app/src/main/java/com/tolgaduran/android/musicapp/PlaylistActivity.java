package com.tolgaduran.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        ListView listViewPlaylist=(ListView)findViewById(R.id.activity_playlist);

        List<String> listPlaylist=new ArrayList<String>();
        listPlaylist.add("My Playlist");
        listPlaylist.add("Rock Playlist");
        listPlaylist.add("Favorites");

        ArrayAdapter<String> arrayAdapterPlaylist= new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                listPlaylist);

        listViewPlaylist.setAdapter(arrayAdapterPlaylist);
    }
}
