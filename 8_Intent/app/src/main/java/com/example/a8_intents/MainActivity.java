package com.example.a8_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Call(View view) {
        Uri uri=Uri.parse("tel:+923344037449");
        Intent intent=new Intent(Intent.ACTION_DIAL,uri);
        startActivity(intent);
    }

    public void OpenWebsite(View view) {
        Uri uri=Uri.parse("http://www.haqnawaz.org");
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}