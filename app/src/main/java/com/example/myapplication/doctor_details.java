package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class doctor_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_details);

        //getting extras from the intent

        Bundle b = getIntent().getExtras();
        doctors_list p = (doctors_list) b.getSerializable("doctor");

        //connecting items to xml

        ImageView paraimg = findViewById(R.id.doc_detail_img);
        TextView  name = findViewById(R.id.doctorname);
        TextView patients = findViewById(R.id.patient_num);
        TextView experince = findViewById(R.id.experince_num);
        TextView rate = findViewById(R.id.rating_num);
        TextView para = findViewById(R.id.info_para);
        TextView phone = findViewById(R.id.phone_num);
        TextView email = findViewById(R.id.email);

        //setting the details from extras

        paraimg.setImageResource(p.getImage());
        name.setText(p.getName());
        patients.setText(p.getPatient());
        experince.setText(p.getExperince());
        rate.setText(""+p.getRate());
        para.setText(p.getPara());
        phone.setText(p.getPhoneNum());
        email.setText(p.getEmail());
    }
}