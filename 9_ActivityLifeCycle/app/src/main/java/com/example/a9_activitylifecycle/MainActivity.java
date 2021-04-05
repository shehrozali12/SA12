package com.example.a9_activitylifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    int count=0;
    Button button;

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ALC", "onStart called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ALC", "onPause called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ALC", "onResume called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ALC", "onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ALC", "onDestroy called");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("value", count);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.buttonCount);
        textView=findViewById(R.id.textViewCounter);
        Log.d("ALC", "onCreate called");
        if(savedInstanceState!=null)
        {
            count=savedInstanceState.getInt("value");
            textView.setText(String.valueOf(count));
        }
    }

    public void IncreaseNumber(View view) {
        count=Integer.parseInt(textView.getText().toString());
        count++;
        textView.setText(String.valueOf(count));
    }

    public void MoveActivity2(View view) {
        Intent intent=new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void MoveActivity3(View view) {
        Intent intent=new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}