package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Student> list;
    RecyclerView recyclerView;
    AdapterForRecycler adapterForRecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerInMain);
        list=new ArrayList<>();
        String[] nameArray={"Ali","Akbar","Uzair","Umair","Asad"};
        int[] ageArray={21,22,42,21,20};
        String[] degreeArray={"MSC","BS","BS","MSC","BA"};
        for(int i=0;i<5;i++)
        {
            list.add(new Student(nameArray[i],ageArray[i],degreeArray[i]));
        }

        adapterForRecycler=new AdapterForRecycler(list);
        recyclerView.setAdapter(adapterForRecycler);
    }
}