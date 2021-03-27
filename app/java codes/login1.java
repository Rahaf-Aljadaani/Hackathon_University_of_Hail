package com.example.thefastestfarmer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class login1 extends AppCompatActivity {
    EditText user;
    EditText pass;
    String arrayuser[] = {"Ahmad","rahaf"};
    String arraypass[] = {"123","123"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);
        user=findViewById(R.id.e1);
        pass=findViewById(R.id.e2);
// go to home page
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(login1.this, firstframe.class);
                startActivity(intent);
                finish();
            }
        },1000);


    }
    public void page1(View view){
        int x=0;
        for (int i =0; i<arrayuser.length;i++){
       if(arrayuser[i].equals(user)){
           if(arraypass[i].equals(pass)){
               x=1;
page2();
           }
       }}

        if(x==0){
            Toast.makeText(getApplicationContext(),  "username or pass is wrong ", Toast.LENGTH_SHORT).show();

        }
    }
    public void page2(){
        Intent intent = new Intent(login1.this, firstframe.class);
        startActivity(intent);
        finish();
    }

}