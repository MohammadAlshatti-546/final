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

public class treat_Adapter extends RecyclerView.Adapter{


    //define items


    ArrayList<how_titles> hArray ;
    Context c ;

    //constructor

    public treat_Adapter(ArrayList<how_titles> hArray, Context c) {
        this.hArray = hArray;
        this.c = c;
    }

    //on create methode

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.treat_list_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    //on bind methode


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder) holder).img.setImageResource(hArray.get(position).getImage());
        ((ViewHolder) holder).treat_title.setText(hArray.get(position).getName());
        ((ViewHolder) holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(c,treat_details.class);
                i.putExtra("treat", hArray.get(position));
                c.startActivity(i);
            }
        });



        }

        //get methode

    @Override
    public int getItemCount() {
        return hArray.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView img ;
        public TextView treat_title ;
        public View view ;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView ;

            img = itemView.findViewById(R.id.treat_image);
            treat_title = itemView.findViewById(R.id.treat_title);
        }
    }
}
