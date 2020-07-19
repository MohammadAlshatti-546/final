package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class treat_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treat_details);

        //getting extras from intent

        Bundle b = getIntent().getExtras();
        how_titles p = (how_titles) b.getSerializable("treat");

        //connecting items to xml


        final TextView name = findViewById(R.id.title_treat);
        final TextView para = findViewById(R.id.paraghraph_treat);
        final ImageView img = findViewById(R.id._para_img);


        // connecting the adapter to the page


        name.setText(p.getName());
        para.setText(p.getPara());
        img.setImageResource(p.getImage());

    }
}