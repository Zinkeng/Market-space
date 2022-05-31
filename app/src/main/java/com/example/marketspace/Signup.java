package com.example.marketspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Signup extends AppCompatActivity {


    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        button = (Button) findViewById(R.id.button3);

    }

    public void signUp(){
        setContentView(R.layout.activity_verificationpage);
        Intent intent = new Intent(this,verificationpage.class);
        startActivity(intent);

    }
}