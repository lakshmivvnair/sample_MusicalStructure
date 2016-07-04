package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        final TextView recentlyPlayed = (TextView) findViewById(R.id.tvRecentlyPlayed);
        TextView albums = (TextView) findViewById(R.id.albums);
        TextView artists = (TextView) findViewById(R.id.tvArtists);
        TextView songs = (TextView) findViewById(R.id.tvSongs);
        TextView podcasts = (TextView) findViewById(R.id.tvPodcasts);
        RelativeLayout openNowPlaying = (RelativeLayout) findViewById(R.id.openNowPlaying);

        recentlyPlayed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PlaylistsActivity.this, MainActivity.class));
            }
        });

        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PlaylistsActivity.this, AlbumsActivity.class));
            }
        });

        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PlaylistsActivity.this, ArtistsActivity.class));
            }
        });

        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PlaylistsActivity.this, SongsActivity.class));
            }
        });

        podcasts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PlaylistsActivity.this, PodcastActivity.class));
            }
        });

        openNowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PlaylistsActivity.this, NowPlayingActivity.class));
            }
        });
    }
}
