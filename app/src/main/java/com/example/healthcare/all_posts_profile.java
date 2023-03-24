package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.lang.reflect.Field;

public class all_posts_profile extends AppCompatActivity {

    //public String[] sources = {id_1",id_2,id_1",id_2,id_1",id_2,id_1",id_2,id_1",id_2,id_1",id_2,id_1",id_2,id_1",id_2,id_1",id_2};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_posts_profile);

        // recycler view
        RecyclerView all_post = findViewById(R.id.all_posts);
        all_post.setLayoutManager(new LinearLayoutManager(this));
        String id_1 ="";
        String id_2 ="";
        try {
            Class res = R.drawable.class;
            Field field1 = res.getField("sample_post1");
            Field field2 = res.getField("sample_post2");
            id_1 = String.valueOf(field1.getInt(null));
            id_2 = String.valueOf(field2.getInt(null));
        }
        catch (Exception e) {
            Toast.makeText(getApplicationContext(),"Failed :"+e,Toast.LENGTH_SHORT).show();
        }
        String[] sources = {id_1,id_2,id_1,id_2,id_1,id_2,id_1,id_2,id_1,id_2,id_1,id_2,id_1,id_2,id_1,id_2,id_1,id_2};;
        all_post.setAdapter(new All_post_Adapter(sources));
    }
}