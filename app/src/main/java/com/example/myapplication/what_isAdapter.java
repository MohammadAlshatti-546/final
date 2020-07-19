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

public class what_isAdapter extends RecyclerView.Adapter {

    //items define

    ArrayList<titles> tArray;
    Context c ;

    //constructor

    public what_isAdapter(ArrayList<titles> tArray, Context c) {
        this.tArray = tArray;
        this.c = c;
    }

    //on create methode

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.what_is_list_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    //on bind methode

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder)holder).img_what.setImageResource(tArray.get(position).getImage());
        ((ViewHolder)holder).title_what.setText(tArray.get(position).getName());
        ((ViewHolder)holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(c,whatis_details.class);
                i.putExtra("extra_what",tArray.get(position));
                c.startActivity(i);
            }
        });

    }

    //get methode

    @Override
    public int getItemCount() {
        return tArray.size(); }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView img_what;
        public TextView title_what;
        public View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            title_what = itemView.findViewById(R.id.title_);
            img_what = itemView.findViewById(R.id.title_image);
        }
    }
}
