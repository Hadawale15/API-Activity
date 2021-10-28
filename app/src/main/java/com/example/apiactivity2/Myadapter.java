package com.example.apiactivity2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Myadapter extends RecyclerView.Adapter<MyViewHolder> {
    List<Model> list;
    LayoutInflater inflater;

    public Myadapter(List<Model> list) {
        this.list = list;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

   inflater=LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.newlayout,null,false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Model model=list.get(position);
        holder.id.setText(Integer.toString(model.getId()));
        holder.userid.setText(Integer.toString(model.getUserid()));
        holder.title.setText(model.getTitle());
        holder.body.setText(model.getBody());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
