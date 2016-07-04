package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class PodcastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podcast);

        final TextView recentlyPlayed = (TextView) findViewById(R.id.tvRecentlyPlayed);
        TextView albums = (TextView) findViewById(R.id.albums);
        TextView artists = (TextView) findViewById(R.id.tvArtists);
        TextView songs = (TextView) findViewById(R.id.tvSongs);
        TextView playlist = (TextView) findViewById(R.id.tvPlaylist);
        RelativeLayout openNowPlaying = (RelativeLayout) findViewById(R.id.openNowPlaying);

        recentlyPlayed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PodcastActivity.this, MainActivity.class));
            }
        });

        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PodcastActivity.this, AlbumsActivity.class));
            }
        });

        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PodcastActivity.this, ArtistsActivity.class));
            }
        });

        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PodcastActivity.this, PlaylistsActivity.class));
            }
        });

        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PodcastActivity.this, SongsActivity.class));
            }
        });

        openNowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PodcastActivity.this, NowPlayingActivity.class));
            }
        });
    }
}
