package com.example.tutorial4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        username=getIntent().getStringExtra(username);
        message=findViewById(R.id.message);
        message.setText("WELCOME TO WORLD ADMIN!");

    }
}