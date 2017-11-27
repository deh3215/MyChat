package com.example.a32150.mychat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    EditText et;
    ListView lv;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText)findViewById(R.id.editText);
        lv = (ListView)findViewById(R.id.listView);
        adapter = new ArrayAdapter<String>(this, R.layout.simple_list_item_1, R.id.text1);
        lv.setAdapter(adapter);
    }

    public void onClick(View v)   {
        adapter.add(et.getText().toString());
    }



}
