package com.example.codesoft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        //status bar

        getWindow().setStatusBarColor(Color.parseColor("#500A0A"));



        //Navigation Bar
        getWindow().setNavigationBarColor(Color.parseColor("#500A0A"));
        Toast.makeText(this, "welcome", Toast.LENGTH_SHORT).show();

        //Timer Schedule

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent= new Intent(getApplicationContext(), onboarding_one.class);
                finish();
                startActivity(intent);
            }
        },1200);
    }
}