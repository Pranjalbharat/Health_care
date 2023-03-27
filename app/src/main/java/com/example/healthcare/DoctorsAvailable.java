package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.lang.reflect.Field;
import java.util.Map;

public class DoctorsAvailable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors_available);

        // recycler view
        RecyclerView all_post = findViewById(R.id.all_posts);
        all_post.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        String[] D_names = {"Shubham","Pranjal ","Rashmi ","Shreya","Swayam","Neeraj","Vanshika","Ditya","Pranshu","Sucrose"};
        all_post.setAdapter(new profile_card_adapter(D_names));
    }
}