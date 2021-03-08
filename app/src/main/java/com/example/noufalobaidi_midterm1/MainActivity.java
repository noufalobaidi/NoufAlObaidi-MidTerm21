package com.example.noufalobaidi_midterm1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer song;
    int y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img=(ImageView)findViewById(R.id.imageView);
        Button bttn1=(Button)findViewById(R.id.button);
        Button bttn2=(Button)findViewById(R.id.button2);
        song=new MediaPlayer();
        song=MediaPlayer.create(this,R.raw.track1);
        y=1;

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                y++;
                if(y%2==0)
                    song.start();
                else
                    song.pause();

            }
        });


        bttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Activity2.class));
            }
        });

        bttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Activity3.class));
            }
        });

    }
}