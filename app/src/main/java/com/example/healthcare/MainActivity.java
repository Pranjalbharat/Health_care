package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton button = findViewById(R.id.imageButton2);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToCreatorLogin(v);
            }
        });
    }

    public void goToCreatorLogin(View view) {
        Intent intent = new Intent(this, login_creator_details.class);
        startActivity(intent);
        finish();
    }
}