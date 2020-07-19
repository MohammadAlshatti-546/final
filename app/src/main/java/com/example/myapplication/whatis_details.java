package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class whatis_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatis_details);

        //getting extras from intent


        Bundle b = getIntent().getExtras();
       titles p = (titles) b.getSerializable("extra_what");


       //connecting items to xml

        final TextView title_what = findViewById(R.id.title_what);
        final TextView para_what = findViewById(R.id.paraghraph_what);
        final ImageView what_img = findViewById(R.id.para_img);

        //setting details

        title_what.setText(p.getName());
        para_what.setText(p.getPara());
        what_img.setImageResource(p.getImage());





    }
    //public static final String KEY ="key";
}