package com.example.thefastestfarmer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class farme extends AppCompatActivity {
    EditText userInput;
    LinearLayout lay;
    TextView tx;
    String the_chat =" ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farme);

        userInput = findViewById(R.id.texting);
        lay = findViewById(R.id.w23);
        tx = findViewById(R.id.textView15);


    }



    public void sendtext(View view){

        userInput.onEditorAction(EditorInfo.IME_ACTION_DONE);

        the_chat =userInput.getText().toString();
        userInput.getText().clear();
        tx.setText(the_chat);
        lay.setVisibility(View.VISIBLE);


    }
    public void profile(View view){
        Intent intent = new Intent(farme.this, login1.class);
        startActivity(intent);
        finish();
    }

    public void home(View view){
        Intent intent = new Intent(farme.this, firstframe.class);
        startActivity(intent);
        finish();
    }

    public void basket(View view){
        Intent intent = new Intent(farme.this, basket1.class);
        startActivity(intent);
        finish();
    }


    public void chat(View view){
        Intent intent = new Intent(farme.this, farme.class);
        startActivity(intent);
        finish();
    }



    public void page1(View view){
        Intent intent = new Intent(farme.this, firstframe.class);
        startActivity(intent);
        finish();
    }
}
