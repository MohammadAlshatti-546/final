package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class pop_up_activity extends Activity {

    //items define

    Button ignore ;
    Button go ;
    TextView advice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up_activity);


        //if(Mscore > 19){
            //advice.setText("حالتك تستدعي أن تراجع طبيبا نفسيا حالا !");
        //}
        //else if(Mscore > 14){
            //advice.setText("من الأفضل لك استشارة طبيب حيث حالتك خطرة إلى حد ما  ");
        //}
        //else if(Mscore > 9){
            //advice.setText("استشر طبيبا للاحتياط ");
        //}


        //connecting items to xml


        ignore = (Button) findViewById(R.id.ignore);
        go = (Button) findViewById(R.id.go);
        advice = findViewById(R.id.advice);

        //Buttons on click listener


        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(pop_up_activity.this,depression_doctors_list.class);
                startActivity(i);
                finish();
            }
        });
        ignore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



       //setting the pop up


        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.9), (int)(height*.6));


        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.CENTER ;
        params.x = 0 ;
        params.y =-20 ;
        getWindow().setAttributes(params);

    }
}