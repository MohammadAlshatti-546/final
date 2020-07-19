package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.mikhaellopez.circularprogressbar.CircularProgressBar;

import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;

public class test_results extends AppCompatActivity {


    //define items


    TextView Mscore;
    TextView Mdanger;
    Button mtry ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_results);

        //connecting items to xml

        Mscore = findViewById(R.id.score);
        Mdanger = findViewById(R.id.danger_limit);
        CircularProgressBar circularProgressBar = findViewById(R.id.progressbar);
        //mtry = findViewById(R.id.button_try);
        //mtry.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View view) {
                //Intent i = new Intent(test_results.this,pop_up_activity.class);
                //startActivity(i);
            //}
        //});
        //progressBar= findViewById(R.id.progressbar);



        //getting extras from intent


        Bundle bundle = getIntent().getExtras();
        final int score = bundle.getInt("finalscore");
        Mscore.setText(" " + score);


        //if statments for the result


        if (score > 19) {
            Mdanger.setText("خطر قاتل");
            Handler handler=new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent i = new Intent(test_results.this,pop_up_activity.class);
                    startActivity(i);
                }
            },4500);
        } else if (score > 14) {
            Mdanger.setText("خطرعالي");
            Handler handler=new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent i = new Intent(test_results.this,pop_up_activity.class);
                    startActivity(i);
                }
            },4500);
        } else if (score > 9) {
            Mdanger.setText("خطر معتدل");
            Handler handler=new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent i = new Intent(test_results.this,pop_up_activity.class);
                    startActivity(i);
                }
            },4500);
        } else if (score > 4) {
            Mdanger.setText("خطر قليل");

        } else if (score >= 0) {
            Mdanger.setText("خطر قليل جدا");

        }


        //circular progress animation set

        circularProgressBar.setProgressWithAnimation(score, (long) 2000);
    }

    }