package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        TextView recentlyPlayed = (TextView) findViewById(R.id.tvRecentlyPlayed);
        TextView artists = (TextView) findViewById(R.id.tvArtists);
        TextView songs = (TextView) findViewById(R.id.tvSongs);
        TextView playlist = (TextView) findViewById(R.id.tvPlaylist);
        TextView podcasts = (TextView) findViewById(R.id.tvPodcasts);
        RelativeLayout openNowPlaying = (RelativeLayout) findViewById(R.id.openNowPlaying);

        recentlyPlayed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AlbumsActivity.this, MainActivity.class));
            }
        });


        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AlbumsActivity.this, ArtistsActivity.class));
            }
        });

        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AlbumsActivity.this, PlaylistsActivity.class));
            }
        });

        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AlbumsActivity.this, SongsActivity.class));
            }
        });

        podcasts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AlbumsActivity.this, PodcastActivity.class));
            }
        });

        openNowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AlbumsActivity.this, NowPlayingActivity.class));
            }
        });
    }
}
