package com.example.noufalobaidi_midterm1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(SplashActivity.this, MainActivity.class));

            }
        };
        Timer opening = new Timer();
        opening.schedule(task,5000);
        Toast.makeText(SplashActivity.this, "6 seconds ", Toast.LENGTH_LONG).show();
    }
}

