package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

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

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str="Shubham";
                Intent intent = new Intent(getApplicationContext(), profile_doctors.class);
                intent.putExtra("data", str);
                startActivity(intent);
            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str="Pranjal ";
                Intent intent = new Intent(getApplicationContext(), profile_doctors.class);
                intent.putExtra("data", str);
                startActivity(intent);
            }
        });

        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str="Rashmi ";
                Intent intent = new Intent(getApplicationContext(), profile_doctors.class);
                intent.putExtra("data", str);
                startActivity(intent);
            }
        });

        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str="Shreya";
                Intent intent = new Intent(getApplicationContext(), profile_doctors.class);
                intent.putExtra("data", str);
                startActivity(intent);
            }
        });

        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str="Swayam";
                Intent intent = new Intent(getApplicationContext(), profile_doctors.class);
                intent.putExtra("data", str);
                startActivity(intent);
            }
        });

        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str="Neeraj";
                Intent intent = new Intent(getApplicationContext(), profile_doctors.class);
                intent.putExtra("data", str);
                startActivity(intent);
            }
        });

        Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str="Vanshika";
                Intent intent = new Intent(getApplicationContext(), profile_doctors.class);
                intent.putExtra("data", str);
                startActivity(intent);
            }
        });

        Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str="Ditya";
                Intent intent = new Intent(getApplicationContext(), profile_doctors.class);
                intent.putExtra("data", str);
                startActivity(intent);
            }
        });

        Button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str="Pranshu";
                Intent intent = new Intent(getApplicationContext(), profile_doctors.class);
                intent.putExtra("data", str);
                startActivity(intent);
            }
        });

        Button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str="Sucrose";
                Intent intent = new Intent(getApplicationContext(), profile_doctors.class);
                intent.putExtra("data", str);
                startActivity(intent);
            }
        });







    }
}