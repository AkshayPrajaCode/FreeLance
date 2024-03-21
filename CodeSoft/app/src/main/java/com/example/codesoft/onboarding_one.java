package com.example.codesoft;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class onboarding_one extends AppCompatActivity {
    //Dialog
    Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding_one);

        getWindow().setStatusBarColor(Color.parseColor("#500A0A"));



        //Navigation Bar
        getWindow().setNavigationBarColor(Color.parseColor("#500A0A"));


        //Btn_saved

        findViewById(R.id.btn_editAddress).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog=new Dialog(onboarding_one.this);

            }
        });
    }
}