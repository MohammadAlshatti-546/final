package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class depression_test extends AppCompatActivity {

    //defining items


    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView textViewQuestion ;
    private TextView textViewQuestionCount ;
    private TextView scorea ;
    private Button buttonNever ;
    private Button buttonSome ;
    private Button buttonNear ;
    private Button buttonAlways ;
    private Button buttonNext ;
    private int mscore = 0 ;
    private int mQuestionCount = 0 ;
    private int mQuestionNumber = 0 ;
    private RadioGroup radiogroup ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depression_test);


        //connecting items to xml

        textViewQuestion = findViewById(R.id.test_question);
        textViewQuestionCount = findViewById(R.id.count);
        radiogroup = findViewById(R.id.radioGroup);
        scorea = findViewById(R.id.scorea);
        buttonNever =(RadioButton) findViewById(R.id.never);
        buttonSome = (RadioButton) findViewById(R.id.sometimes);
        buttonNear = (RadioButton) findViewById(R.id.mostly);
        buttonAlways = (RadioButton) findViewById(R.id.always);
        buttonNext = findViewById(R.id.next);
        updatequestion();

        //buttons On Click listener & if statments


        buttonNever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(buttonNever.getText() ==buttonNever.getText()){
                    mscore = mscore + 0 ;
                }
                int clicks = 0 ;
                clicks++;
                if (clicks >= 9){
                    buttonNever.setEnabled(false);
                }
            }
        });

        buttonSome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(buttonSome.getText() ==buttonSome.getText()){
                    mscore = mscore + 1 ;
                }
                int clicks = 0 ;
                clicks++;
                if (clicks >= 9){
                    buttonSome.setEnabled(false);
                }
            }
        });


        buttonNear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(buttonNear.getText() ==buttonNear.getText()){
                    mscore = mscore + 2 ;
                }
                int clicks = 0 ;
                clicks++;
                if (clicks >= 9){
                    buttonNear.setEnabled(false);
                }
            }
        });
        buttonAlways.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(buttonAlways.getText() ==buttonAlways.getText()){
                    mscore = mscore + 3 ;
                }
                int clicks = 0 ;
                clicks++;
                if (clicks >= 9){
                    buttonAlways.setEnabled(false);
                }
            }
        });













       buttonNext.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(radiogroup.getCheckedRadioButtonId()==-1 ){

                   Toast.makeText(depression_test.this,"من فضلك اختر اجابة",Toast.LENGTH_LONG).show();
               }
                  else if (mQuestionNumber == QuestionLibrary.mQuestions.length){
                   Intent i = new Intent(depression_test.this,test_results.class);
                   Bundle bundle = new Bundle();
                   bundle.putInt("finalscore",mscore);
                   i.putExtras(bundle);
                   depression_test.this.finish();
                   startActivity(i);
               }
               else {
                   updatequestion();
                   updatescore(mscore);

               }

           }
       });
       //QuizDbHelper dbHelper = new QuizDbHelper(this);
        //questionList = dbHelper.getAllQuestions();
    }
    private void updatequestion (){

        textViewQuestion.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        buttonNever.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        buttonSome.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        buttonNear.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        buttonAlways.setText(mQuestionLibrary.getChoice4(mQuestionNumber));
       mQuestionCount++ ;
       textViewQuestionCount.setText(""+ mQuestionCount);
        mQuestionNumber++ ;
        radiogroup.clearCheck();



    }
    public void updatescore(int point){
        scorea.setText(""+mscore);
    }
    }