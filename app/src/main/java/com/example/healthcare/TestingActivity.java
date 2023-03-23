package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class TestingActivity extends AppCompatActivity {
     private FirebaseAuth mauth;
    private Button logout ;
    private Button check_profile ;
    private TextView user_details;
    private EditText doctor_input;
    private FirebaseUser user;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing);

        mauth=FirebaseAuth.getInstance();
        logout=findViewById(R.id.logout);
        check_profile=findViewById(R.id.check_profile);
        user_details=findViewById(R.id.user_details);
        user=mauth.getCurrentUser();
        if(user == null){
            Intent intent= new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
            finish();
        }
        else{
            user_details.setText(user.getEmail());
        }

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent intent= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


        check_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //FirebaseAuth.getInstance().signOut();
                Intent intent= new Intent(getApplicationContext(),profile_doctors.class);
                doctor_input = findViewById(R.id.doctor_name);
                String doctor_name = doctor_input.getText().toString();
//                Toast.makeText(getApplicationContext(),doctor_name,Toast.LENGTH_SHORT).show();
                intent.putExtra("data", doctor_name);
                startActivity(intent);
                finish();
            }
        });



    }
}