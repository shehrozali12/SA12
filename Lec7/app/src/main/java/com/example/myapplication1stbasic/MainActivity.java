package com.example.myapplication1stbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         button=findViewById(R.id.button5);
         textView=findViewById(R.id.textViewCode);
    }

    public void SomeOneIsThere(View view) {
        textView.setText("Some one New is there");
    }
}