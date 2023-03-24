package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

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

import java.util.Map;

public class DoctorsAvailable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors_available);

        ImageButton Button1=findViewById(R.id.imageButton);
        ImageButton Button2=findViewById(R.id.imageButton2);
        ImageButton Button3=findViewById(R.id.imageButton3);
        ImageButton Button4=findViewById(R.id.imageButton4);
        ImageButton Button5=findViewById(R.id.imageButton5);
        ImageButton Button6=findViewById(R.id.imageButton6);
        ImageButton Button7=findViewById(R.id.imageButton7);
        ImageButton Button8=findViewById(R.id.imageButton8);
        ImageButton Button9=findViewById(R.id.imageButton9);
        ImageButton Button10=findViewById(R.id.imageButton10);

        TextView d_name1=findViewById(R.id.textView5);
        TextView d_name2=findViewById(R.id.textView52);
        TextView d_name3=findViewById(R.id.textView53);
        TextView d_name4=findViewById(R.id.textView54);
        TextView d_name5=findViewById(R.id.textView55);
        TextView d_name6=findViewById(R.id.textView56);
        TextView d_name7=findViewById(R.id.textView57);
        TextView d_name8=findViewById(R.id.textView58);
        TextView d_name9=findViewById(R.id.textView59);
        TextView d_name10=findViewById(R.id.textView510);



        String[] D_names = {"Shubham","Pranjal ","Rashmi ","Shreya","Swayam","Neeraj","Vanshika","Ditya","Pranshu","Sucrose"};


        d_name1.setText(D_names[0]);
        d_name2.setText(D_names[1]);
        d_name3.setText(D_names[2]);
        d_name4.setText(D_names[3]);
        d_name5.setText(D_names[4]);
        d_name6.setText(D_names[5]);
        d_name7.setText(D_names[6]);
        d_name8.setText(D_names[7]);
        d_name9.setText(D_names[8]);
        d_name10.setText(D_names[9]);








        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), profile_doctors.class);
                intent.putExtra("data", D_names[0]);
                startActivity(intent);
            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), profile_doctors.class);
                intent.putExtra("data",  D_names[1]);
                startActivity(intent);
            }
        });

        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), profile_doctors.class);
                intent.putExtra("data", D_names[2]);
                startActivity(intent);
            }
        });

        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), profile_doctors.class);
                intent.putExtra("data",  D_names[3]);
                startActivity(intent);
            }
        });

        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), profile_doctors.class);
                intent.putExtra("data",  D_names[4]);
                startActivity(intent);
            }
        });

        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), profile_doctors.class);
                intent.putExtra("data",  D_names[5]);
                startActivity(intent);
            }
        });

        Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), profile_doctors.class);
                intent.putExtra("data",  D_names[6]);
                startActivity(intent);
            }
        });

        Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), profile_doctors.class);
                intent.putExtra("data",  D_names[7]);
                startActivity(intent);
            }
        });

        Button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), profile_doctors.class);
                intent.putExtra("data",  D_names[8]);
                startActivity(intent);
            }
        });

        Button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), profile_doctors.class);
                intent.putExtra("data",  D_names[9]);
                startActivity(intent);
            }
        });







    }
}