package com.example.myapplication;

import java.io.Serializable;

public class quiz_titles implements Serializable {


    //define items


    private  String name ;
    private  String para ;
    private int image ;


    //constructor


    public quiz_titles(String name, String para, int image) {
        this.name = name;
        this.para = para;
        this.image = image;
    }


    //setters and getters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
