package com.example.healthcare;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class profile_card_adapter  extends RecyclerView.Adapter<profile_card_adapter.posts_viewHolder>{
    private String[] data;

    //constructor here
    public profile_card_adapter(String[] data){
        this.data = data;
    }

    @NonNull
    @Override
    public profile_card_adapter.posts_viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.profile_card_doctor, parent, false);
        return new posts_viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull profile_card_adapter.posts_viewHolder holder, int position) {
        String source = data[position];
        holder.name.setText(source);
        holder.imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // starting profile page.
                Intent intent = new Intent(view.getContext(), profile_doctors.class);
                intent.putExtra("data", source);
                view.getContext().startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class posts_viewHolder extends RecyclerView.ViewHolder{

        TextView name;
        ImageButton imageButton;
        public posts_viewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name_text);
            imageButton = itemView.findViewById(R.id.imageButton_card);

        }
    }
}
