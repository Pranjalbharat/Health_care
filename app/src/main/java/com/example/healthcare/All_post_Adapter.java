package com.example.healthcare;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class All_post_Adapter extends RecyclerView.Adapter<All_post_Adapter.posts_viewHolder> {

    private String[] data;

    //constructor here
    public All_post_Adapter(String[] data){
        this.data = data;
    }

    @NonNull
    @Override
    public posts_viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.post_item, parent, false);
        return new posts_viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull posts_viewHolder holder, int position) {
        String source = data[position];
//        holder.post_image.setBackgroundResource(Integer.parseInt(source));
        holder.post_image.setImageResource(Integer.parseInt(source));
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class posts_viewHolder extends RecyclerView.ViewHolder{
        ImageButton post_image;
        ImageButton like_button;

        Boolean liked1 = false;

        public posts_viewHolder(@NonNull View itemView) {
            super(itemView);
            post_image = itemView.findViewById(R.id.post_image);

            // like functionality should be data fetch based.   CHANGE THIS
            like_button = itemView.findViewById(R.id.like_post1);
            like_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!liked1){
                        like_button.setImageResource(R.drawable.red_heart_like);
                        liked1 = true;
                    }
                    else{
                        like_button.setImageResource(R.drawable.blank_heart_like);
                        liked1 = false;
                    }
                }
            });
        }
    }
}
