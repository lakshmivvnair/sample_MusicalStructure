package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        final TextView recentlyPlayed = (TextView) findViewById(R.id.tvRecentlyPlayed);
        TextView albums = (TextView) findViewById(R.id.albums);
        TextView artists = (TextView) findViewById(R.id.tvArtists);
        TextView playlist = (TextView) findViewById(R.id.tvPlaylist);
        TextView podcasts = (TextView) findViewById(R.id.tvPodcasts);
        RelativeLayout openNowPlaying = (RelativeLayout) findViewById(R.id.openNowPlaying);

        recentlyPlayed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SongsActivity.this, MainActivity.class));
            }
        });

        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SongsActivity.this, AlbumsActivity.class));
            }
        });

        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SongsActivity.this, ArtistsActivity.class));
            }
        });

        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SongsActivity.this, PlaylistsActivity.class));
            }
        });

        podcasts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SongsActivity.this, PodcastActivity.class));
            }
        });

        openNowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SongsActivity.this, NowPlayingActivity.class));
            }
        });
    }
}
