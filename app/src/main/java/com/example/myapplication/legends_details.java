package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class legends_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legends_details);

        //getting extras from intent

        Bundle b = getIntent().getExtras();
        legends_titles p = (legends_titles) b.getSerializable("legend");

        //connecting items to xml

        final TextView title = findViewById(R.id.title_legend);
        final TextView para = findViewById(R.id.paraghraph_legend);
        final ImageView img = findViewById(R.id.legend_para_img);

        // connecting the adapter to the page


        title.setText(p.getName());
        para.setText(p.getPara());
        img.setImageResource(p.getImage());
    }
}