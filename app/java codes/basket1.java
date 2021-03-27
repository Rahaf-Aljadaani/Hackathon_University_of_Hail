package com.example.thefastestfarmer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class basket1 extends AppCompatActivity {
static ArrayList<String> basket = new ArrayList<>();
//    ArrayList<String> texts = new ArrayList<String>();
    ListView listView;
    ArrayAdapter<String> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket1);

        listView = (ListView) findViewById(R.id.a98);

       items = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,basket);

        listView.setAdapter(items);
        basket.add("سماد بلوكورن");
        basket.add("سماد بلوكورن");
        basket.add("سماد بلوكورن");
        items.notifyDataSetChanged();


    }

    public void profile(View view){
        Intent intent = new Intent(basket1.this, login1.class);
        startActivity(intent);
        finish();
    }

    public void home(View view){
        Intent intent = new Intent(basket1.this, firstframe.class);
        startActivity(intent);
        finish();
    }

    public void basket(View view){
        Intent intent = new Intent(basket1.this, basket1.class);
        startActivity(intent);
        finish();
    }


    public void chat(View view){
        Intent intent = new Intent(basket1.this, farme.class);
        startActivity(intent);
        finish();
    }



}