package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class quiz_adabter extends RecyclerView.Adapter {

    //define items

    ArrayList<quiz_titles> qArray;
    Context c ;


    //constructor


    public quiz_adabter(ArrayList<quiz_titles> qArray, Context c) {
        this.qArray = qArray;
        this.c = c;
    }

    public quiz_adabter(ArrayList<quiz_titles> qArray) {
        this.qArray = qArray;

    }

    //on create method


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.quiz_item_list,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    //on bind method


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder)holder).img.setImageResource(qArray.get(position).getImage());
        ((ViewHolder)holder).quiz_title.setText(qArray.get(position).getName());
        ((ViewHolder)holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(c,quiz_details.class);
                i.putExtra("quiz",qArray.get(position));
                c.startActivity(i);
            }
        });

    }


    //get method


    @Override
    public int getItemCount() {
        return qArray.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView img ;
        public TextView quiz_title ;
        public View view ;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img =itemView.findViewById(R.id.quiz_image);
            quiz_title =itemView.findViewById(R.id.quiz_title);
            view=itemView ;
        }
    }
}
