package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.HashMap;
import java.util.Map;

public class profile_doctors extends AppCompatActivity {

    private boolean liked1 = false;
    private boolean liked2 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_doctors);


        // Find view by id
        ImageButton Profile_Pic = findViewById(R.id.profile_photo);
        TextView Name = findViewById(R.id.username_text);
        TextView Bio = findViewById(R.id.bio_text);

        Intent intent = getIntent();
        String str = intent.getStringExtra("data");
        String key = "Doctor "+str;
        HashMap<String,Object> data = new HashMap<>();
        /*
             //use this to receive data
             String str = send_text.getText().toString();
             Intent intent = new Intent(getApplicationContext(), Second_activity.class);
             intent.putExtra("message_key", str);
         */

        FirebaseFirestore db = FirebaseFirestore.getInstance();
        DocumentReference docRef = db.collection("users").document(key);
        docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    if (document.exists()) {
                        Map<String, Object> map = document.getData();
                        String fetchname = (String) map.get("First name").toString() +" "+map.get("Last name").toString();
                        Name.setText(fetchname);
                        Bio.setText(map.get("Profession").toString());

                    } else {
                        Toast.makeText(getApplicationContext(),"Failed",Toast.LENGTH_SHORT).show();
                    }

                } else {
                    Toast.makeText(getApplicationContext(),"Failed 2",Toast.LENGTH_SHORT).show();
                }
            }
        });


//        String fullname = cloud_data[0]+" "+cloud_data[1];
//        Name.setText(fullname);
//        Bio.setText(cloud_data[2]);



        // POSTS ~here
        ImageButton like_button = findViewById(R.id.like_post1);
        ImageButton like_button2 = findViewById(R.id.like_post2);
        Button report1 = findViewById(R.id.report1);
        Button report2 = findViewById(R.id.report2);



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
        like_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!liked2){
                    like_button2.setImageResource(R.drawable.red_heart_like);
                    liked2 = true;
                }
                else{
                    like_button2.setImageResource(R.drawable.blank_heart_like);
                    liked2 = false;
                }
            }
        });
        report1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Post reported",Toast.LENGTH_SHORT).show();
            }
        });
        report2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Post reported",Toast.LENGTH_SHORT).show();
            }
        });

    }
}