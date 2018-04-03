package com.example.momen.alomusicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //catching first textView ID and store this in nowPlaying
        TextView nowPlaying = findViewById(R.id.now_playing);
        //set onclick listener on the first textView
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlyaingIntent = new Intent(MainActivity.this,NowPlaying.class);
                startActivity(nowPlyaingIntent);
            }
        });

        //catching second textView ID and store it in popMusic
        TextView popMusic = findViewById(R.id.pop_music);
        //set Onclick listener on second textView
        popMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popMusicIntent = new Intent(MainActivity.this, popMusic.class);
                startActivity(popMusicIntent);
            }
        });

        TextView classicMusic = findViewById(R.id.classic_music);

        classicMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent classicMusicIntent = new Intent(MainActivity.this, classicMusic.class);
                startActivity(classicMusicIntent);
            }
        });

        final TextView myList = findViewById(R.id.my_list);

        myList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myListIntent = new Intent(MainActivity.this, myList.class);
                startActivity(myListIntent);
            }
        });
    }
}
