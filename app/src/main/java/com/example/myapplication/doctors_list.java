package com.example.myapplication;

import android.widget.RatingBar;

import java.io.Serializable;

public class doctors_list implements Serializable {

    //items define

    private  String name ;
    private int image ;
    private  String patient ;
    private  String experince ;
    private  String para ;
    private float rate ;
    private String email ;
    private String phoneNum ;
    //private RatingBar ratebar1 ;
    //private RatingBar ratebar2 ;


    //contructor


    public doctors_list(String name, int image, String patient, String experince, String para, float rate, String email, String phoneNum) {
        this.name = name;
        this.image = image;
        this.patient = patient;
        this.experince = experince;
        this.para = para;
        this.rate = rate;
        this.email = email;
        this.phoneNum = phoneNum;
    }


    //setters and getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getExperince() {
        return experince;
    }

    public void setExperince(String experince) {
        this.experince = experince;
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
