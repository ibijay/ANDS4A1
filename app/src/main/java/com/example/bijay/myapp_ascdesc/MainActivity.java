package com.example.bijay.myapp_ascdesc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity  {
    ListView listview;
    ArrayList<String> list;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = (ListView) findViewById(R.id.listView);
        String[] values = new String[] { "Alex", "Bijay", "Chris",
                "Dick", "Elson", "Fernadis", "Gerorge", "Haris",
                "India", "Jack", "Kalis", "Lima", "Max", "Nick",
                "Orlando", "Paris", "Queen", "Ram", "Steve", "Umega",
                "Vicky", "Waga", "Xerex","Yalka", "Zylo" };

        list = new ArrayList<String>();
        for (int i = 0; i < values.length; ++i) {
            list.add(values[i]);
        }

        adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, list);
        listview.setAdapter(adapter);
    }

    public void Ascend(View v){
        Collections.sort(list);
        adapter.notifyDataSetChanged();
    }

    public void Descend(View v){
        Collections.reverse(list);
        adapter.notifyDataSetChanged();
    }

}