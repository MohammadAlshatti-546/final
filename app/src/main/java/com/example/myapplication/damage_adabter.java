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

public class damage_adabter extends RecyclerView.Adapter {
    //ADAPTER array & context for the intent

    ArrayList<damage_titles> dArray ;
    Context c ;
 // constructor

    public damage_adabter(ArrayList<damage_titles> dArray, Context c) {
        this.dArray = dArray;
        this.c = c;
    }

    //On create method

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.damages_list_item,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    //OnBind method

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder)holder).damage_img.setImageResource(dArray.get(position).getImage());
        ((ViewHolder)holder).damage_title.setText(dArray.get(position).getName());
        ((ViewHolder)holder).view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(c,damage_details.class);
                m.putExtra("damage",dArray.get(position));
                c.startActivity(m);

            }
        });

    }

    //get method

    @Override
    public int getItemCount() {
        return dArray.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView damage_img ;
        public TextView damage_title ;
        public View view1 ;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view1 = itemView ;
            damage_img =itemView.findViewById(R.id.damage_image);
            damage_title =itemView.findViewById(R.id.damage_title);
        }
    }
}
