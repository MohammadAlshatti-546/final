package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class splashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Hnadler

        Handler h = new Handler(getMainLooper());
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(splashActivity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        },1500);


    }
}