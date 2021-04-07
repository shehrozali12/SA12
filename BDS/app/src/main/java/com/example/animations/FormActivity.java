package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class FormActivity extends AppCompatActivity {
    ArrayList<MemberModel> friendArrayList;
    ArrayList<String> toShowData;
    EditText editTextName,editTextBG,editTextAge;
    ListView listView;
    ArrayAdapter<String> arrayAdapter;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        toShowData=new ArrayList<String>();

        listView = findViewById(R.id.myListView);
        button=findViewById(R.id.btnAdd);

        editTextName=findViewById(R.id.editTextName);
        editTextBG=findViewById(R.id.editTextTextBloodGroup);
        editTextAge=findViewById(R.id.editTextNumber);

        //String[] friendList = {"Ali", "Saad", "Musa", "Zia"};
        friendArrayList = new ArrayList<MemberModel>();
       /* friendArrayList.add("Ali");
        friendArrayList.add("Babar");
        friendArrayList.add("Shahid");
        friendArrayList.add("Yasir");
        friendArrayList.add("Zain");*/



        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Log.d("You Clicked",friendArrayList.get(i));

//                Intent intent=new Intent(MainActivity.this, DetailActivity.class);
//                intent.putExtra("Friend Name", friendArrayList.get(i));
//                startActivity(intent);
            }
        });
    }

    /*public void AddFriend(View view) {
        friendArrayList.add(editText.getText().toString());
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                friendArrayList);
        listView.setAdapter(arrayAdapter);
        arrayAdapter.notifyDataSetChanged();
        Collections.sort(friendArrayList);
    }*/
    public void AddFriend(View view) {
       MemberModel mem=new MemberModel();
       mem.setName(editTextName.getText().toString());
       mem.setBloodGroup(editTextBG.getText().toString());
       String num=editTextAge.getText().toString();//int mein convert krlein
       mem.setAge(Integer.parseInt(num));
        friendArrayList.add(mem);
       toShowData.add(mem.toString());
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                toShowData);
        listView.setAdapter(arrayAdapter);
        arrayAdapter.notifyDataSetChanged();
        //Collections.sort(friendArrayList);
    }
}