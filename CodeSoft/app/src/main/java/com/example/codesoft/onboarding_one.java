package com.example.codesoft;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import Apater.SilderImageClass;

public class onboarding_one extends AppCompatActivity {
    //Dialog
    Dialog dialog;
    ViewPager PageViwer;
    private int currentPage=0;
    SilderImageClass silderImageClass;


    private int [] images={R.drawable.stocker,R.drawable.reddddd,R.drawable.redhacker};
    private  String [] Messages={"Sell your farm fresh products directly to consumers, cutting out the middleman and reducing emissions of the global supply chain. ","Our team of delivery drivers will make sure your orders are picked up on time and promptly delivered to your customers.","We love the earth and know you do too! Join us in reducing our local carbon footprint one order at a time. "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding_one);

        PageViwer=findViewById(R.id.PageViwer);

        getWindow().setStatusBarColor(Color.parseColor("#500A0A"));



        //Navigation Bar
        getWindow().setNavigationBarColor(Color.parseColor("#500A0A"));


        //Btn_saved**************************************************************************************************
        findViewById(R.id.btn_editAddress).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog=new Dialog(onboarding_one.this);
                dialog.setContentView(R.layout.welcome_pop);
                dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,WindowManager.LayoutParams.MATCH_PARENT);
                dialog.getWindow().getAttributes().windowAnimations = R.style.Theme_CodeSoft;
                dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                dialog.show();

            }
        });
        //*********************************************************************************************************************8



        silderImageClass=new SilderImageClass(this,images,Messages);
        PageViwer.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                currentPage = position;
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}