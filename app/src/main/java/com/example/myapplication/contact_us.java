package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class contact_us extends AppCompatActivity {

    //BUTTON & Textview define

    public EditText mEmail;
    public EditText mName;
    public EditText mMessage;
    public Button senD;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Connecting java items to xml

        setContentView(R.layout.activity_contact_us);
        mEmail = findViewById(R.id.email_enter);
        mName = findViewById(R.id.name_enter);
        mMessage = findViewById(R.id.messege_enter);
        senD = findViewById(R.id.button_send);
        senD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMail();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(contact_us.this, MainActivity.class);
                        startActivity(i);
                    }
                }, 4500);
            }

        });
    }

    //Java API set
    private void sendMail() {
        //String mail = mEmail.getText().toString().trim();
        String message = mEmail.getText().toString() + "    :     " + mMessage.getText().toString();
        String name = mName.getText().toString().trim();

        //send mail
        JavaMailAPI javaMailAPI = new JavaMailAPI(this, "furyzlm.eap@gmail.com", name, message);
        javaMailAPI.execute();

    }
}