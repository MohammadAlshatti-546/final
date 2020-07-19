package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class quiz_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_details);


        //getting extras from intent

        Bundle b = getIntent().getExtras();
        quiz_titles p = (quiz_titles) b.getSerializable("quiz");


        //connecting items to xml

        final TextView title = findViewById(R.id.quiz_title_what);
        final TextView para = findViewById(R.id.paraghraph_quiz);
       final ImageView img = findViewById(R.id.quiz_para_img);

       //setting details


        title.setText(p.getName());
        para.setText(p.getPara());
        img.setImageResource(p.getImage());
    }
}