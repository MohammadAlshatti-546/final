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

public class legends_adapter extends RecyclerView.Adapter{

    //items define

    ArrayList<legends_titles> lArray ;
    Context c ;


    //contructor


    public legends_adapter(ArrayList<legends_titles> lArray, Context c) {
        this.lArray = lArray;
        this.c = c;
    }
    public legends_adapter(ArrayList<legends_titles> lArray) {
        this.lArray = lArray;
    }


    //on create method

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.legend_list_item,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    //on bind method

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder)holder).title.setText(lArray.get(position).getName());
        ((ViewHolder)holder).img.setImageResource(lArray.get(position).getImage());
        ((ViewHolder)holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(c,legends_details.class);
                i.putExtra("legend",lArray.get(position));
                c.startActivity(i);
            }
        });

    }

    //get method


    @Override
    public int getItemCount() {
        return lArray.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView img ;
        public TextView title ;
        public  View view ;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img =itemView.findViewById(R.id.legend_image);
            title=itemView.findViewById(R.id.legend_title);
            view= itemView;
        }
    }
}
