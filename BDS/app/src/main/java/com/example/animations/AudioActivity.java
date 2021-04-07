package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class AudioActivity extends AppCompatActivity {

    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);
        mp=MediaPlayer.create(this,R.raw.a1);

    }

    public void Play(View view) {
        mp.start();
    }

    public void Pause(View view) {
        mp.pause();
    }
}