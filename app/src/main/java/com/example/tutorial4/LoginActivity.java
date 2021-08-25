package com.example.tutorial4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class LoginActivity extends AppCompatActivity {

    EditText email,psw;
    String username="";
    String password="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view) {
            email=findViewById(R.id.name);
            psw=findViewById(R.id.psw);

            username=email.getText().toString();
            password=psw.getText().toString();

            if (username.isEmpty())
            {
                Toast.makeText(this, "Enter Your  Email..", Toast.LENGTH_SHORT).show();
            }   
            if (password.isEmpty())
            {
                Toast.makeText(this, "Enter Your Password..", Toast.LENGTH_SHORT).show();
            }
            else if (!Patterns.EMAIL_ADDRESS.matcher(username).matches())
            {
                Toast.makeText(this, "Enter Valid Mail Address", Toast.LENGTH_SHORT).show();
            }
            else if (username.equals("admin@gmail.com") && password.equals("admin"))
            {
                Intent intent=new Intent(this,MainActivity.class);
                intent.putExtra("username",username);
                startActivity(intent);
                finish();

            }
            else{
                Toast.makeText(this, "Email and password is not valid", Toast.LENGTH_SHORT).show();
            }
    }
}