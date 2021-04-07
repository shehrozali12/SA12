package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    private static int Splashtimeout=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageView);
        //imageView.animate().alpha(0).setDuration(500);
        //imageView.animate().translationYBy(250).setDuration(4000);
        //imageView.animate().rotation(720).setDuration(2000);
        //imageView.animate().rotation(720).alpha(0).setDuration(2000);
        //imageView.animate().scaleX(0.5f).scaleY(0.5f);
        imageView.animate().rotation(720).scaleX(0.5f).scaleY(0.5f).setDuration(2000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,MainView.class);
                startActivity(intent);
                finish();
            }
        }, Splashtimeout);
    }
}