package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_view);
    }



    public void AboutButton(View view) {
        Intent intent=new Intent(MainView.this,MainAbout.class);
        startActivity(intent);
    }

    public void FormButton(View view) {
        Intent intent=new Intent(MainView.this, FormActivity.class);
        startActivity(intent);
    }

    public void videoButton(View view) {
        Intent intent=new Intent(MainView.this, VideoActivity.class);
        startActivity(intent);
    }
}