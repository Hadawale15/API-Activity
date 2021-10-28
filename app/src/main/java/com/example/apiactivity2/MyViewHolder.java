package com.example.apiactivity2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView id,userid,title,body;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        id=itemView.findViewById(R.id.id1);
         userid=itemView.findViewById(R.id.id2);
         title=itemView.findViewById(R.id.title_id);
         body=itemView.findViewById(R.id.body_id);
    }
}
