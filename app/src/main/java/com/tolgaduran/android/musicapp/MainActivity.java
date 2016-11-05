package com.tolgaduran.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView artistText=(TextView)findViewById(R.id.artist);
        artistText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentArtist=new Intent(MainActivity.this,ArtistActivity.class);
                startActivity(intentArtist);
            }
        });

        TextView genreText=(TextView)findViewById(R.id.genre);
        genreText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGenre=new Intent(MainActivity.this,GenresActivity.class);
                startActivity(intentGenre);
            }
        });

        final TextView albumText=(TextView)findViewById(R.id.album);
        albumText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAlbum=new Intent(MainActivity.this,AlbumActivity.class);
                startActivity(intentAlbum);
            }
        });

        TextView playlistText=(TextView)findViewById(R.id.playlist);
        playlistText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPlaylist=new Intent(MainActivity.this,PlaylistActivity.class);
                startActivity(intentPlaylist);
            }
        });
    }
}
