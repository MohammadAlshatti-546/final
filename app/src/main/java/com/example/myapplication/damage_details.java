package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class damage_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_damage_details);

        //getting extras

        Bundle b = getIntent().getExtras();
        damage_titles p = (damage_titles) b. getSerializable("damage");

        //defininig and connecting items  between Java and xml

        final  TextView name = findViewById(R.id.damage_title_what);
        final TextView para = findViewById(R.id.paraghraph_damage);
        final ImageView img = findViewById(R.id.damage_para_img);

        // setting details

        name.setText(p.getName()+"");
        para.setText(p.getPara()+"");
        img.setImageResource(p.getImage());

        //Intent i = new Intent(damage_details.this,settings.class);
        //i.putExtra("para",para);
        //startActivity(i);
    }
}