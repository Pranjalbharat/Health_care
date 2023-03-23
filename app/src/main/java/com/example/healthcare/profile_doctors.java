package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class profile_doctors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_doctors);

        Intent intent = getIntent();
        String str = intent.getStringExtra("doctor_name");

        /*
             //use this to receive data
             String str = send_text.getText().toString();
             Intent intent = new Intent(getApplicationContext(), Second_activity.class);
             intent.putExtra("message_key", str);
         */

    }
}