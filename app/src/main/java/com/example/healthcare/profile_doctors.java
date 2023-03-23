package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
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

    }
}