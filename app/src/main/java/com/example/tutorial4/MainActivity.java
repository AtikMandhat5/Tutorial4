package com.example.tutorial4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String username;
    TextView message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=getIntent().getStringExtra(username);
        message=findViewById(R.id.message);
        message.setText("WELCOME TO WORLD "+username);
    }
}