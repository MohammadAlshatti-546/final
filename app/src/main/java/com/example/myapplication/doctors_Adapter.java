package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.media.Rating;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class doctors_Adapter extends RecyclerView.Adapter {

    //items define

    ArrayList<doctors_list> docArray ;
    Context c ;


      //constructor


    public doctors_Adapter(ArrayList<doctors_list> docArray, Context c) {
        this.docArray = docArray;
        this.c = c;
    }


    //On create method


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.doctors_list_item,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    //On bind method


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder)holder).img.setImageResource(docArray.get(position).getImage());
        ((ViewHolder)holder).doc_name.setText(docArray.get(position).getName());
        ((ViewHolder)holder).rate1.setRating(docArray.get(position).getRate());
        ((ViewHolder)holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(c,doctor_details.class);
                i.putExtra("doctor",docArray.get(position));
                c.startActivity(i);
            }
        });

    }

    //get method

    @Override
    public int getItemCount() {
        return docArray.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView img ;
        public TextView doc_name ;
        public RatingBar rate1 ;
        public View view ;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView ;
            doc_name =itemView.findViewById(R.id.doc_name);
            img =itemView.findViewById(R.id.doctor_img);
            rate1 = itemView.findViewById(R.id.rate1);

        }
    }
}
