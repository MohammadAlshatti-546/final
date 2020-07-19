package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import java.security.Key;

public class settings extends AppCompatActivity {


    //define items

    public TextView eD ,para_legend,para_quiz,para_damage,para_definision,para_treat,test;
    public SeekBar sb ;
    int seekValue ;
    private SharedPreferences prefrences ;
    private static final String PROGRESS ="SEEKBAR";
    private int save ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        //connecting items to xml


        eD = findViewById(R.id.setting_tevt_try);
        sb = findViewById(R.id.seekBar);
        para_legend = findViewById(R.id.paraghraph_legend);
        para_damage = findViewById(R.id.paraghraph_damage);
        //para_definision = findViewById(R.id.paraghraph_what);
        para_quiz = findViewById(R.id.paraghraph_quiz);
        para_treat = findViewById(R.id.paraghraph_treat);

        //setting the share prefrence

        prefrences = getSharedPreferences("",MODE_PRIVATE);
        final SharedPreferences.Editor editor = prefrences.edit();
        sb.setProgress(prefrences.getInt(PROGRESS,0));

       // Intent intent = new Intent(getApplicationContext(),whatis_details.class);
       // Bundle bundle = new Bundle();
      //  bundle.putInt("key",IntValue);
        //intent.putExtras(bundle);
       // startActivity(intent);


        //setting the seek bar
        //getIntent().getExtras("para");


        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b)
            {
                seekValue = progress ;
                eD.setTextSize(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                editor.putInt(PROGRESS,sb.getProgress());
                editor.commit();
                eD.setText(eD.getText().toString());
                eD.setTextSize(seekValue);

                //para_definision = findViewById(R.id.paraghraph_what);
                //para_definision.setText(para_definision.getText().toString());
                //para_definision.setTextSize(seekValue);

                //int seekBarValue = getIntent().getIntExtra(whatis_details.KEY,0);


            }
        });
    }
}