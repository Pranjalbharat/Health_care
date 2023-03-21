package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Toast;

public class login_creator_details extends AppCompatActivity {

    MultiAutoCompleteTextView multiAutoCompleteTextViewDefault;
    String[] professions = {"Doctor", "Pharmacist", "Nurse", "Cardiologist", "Critical Care Medicine Physician Assistant", "Dentist", "Dermatologist",
            "Dietitian", "Genetic Counselor/Counsellor", "Occupational Therapist", "Nephrologist", "Neurologist", "Neuropsychologist" , "Pathologist" , "General practitioner","Psychiatrist",
    "Psychologist","Mental Health Counselor","Yoga Instructor","Physical Therapist","Sport Psychologist","Gynaecologist","General Doctor"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_creator_details);


        // For Multi Auto Complete Text View
        multiAutoCompleteTextViewDefault = findViewById(R.id.multiAutoCompleteTextView);
        ArrayAdapter<String> randomArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, professions);
        multiAutoCompleteTextViewDefault.setAdapter(randomArrayAdapter);
        multiAutoCompleteTextViewDefault.setThreshold(1);
        multiAutoCompleteTextViewDefault.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());


        // Upload document On click function
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Upload Document",Toast.LENGTH_SHORT).show();
            }
        });

        // Submit details On click function
        Button submit_button = findViewById(R.id.submit_button);

        submit_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Details Submitted",Toast.LENGTH_SHORT).show();
            }
        });


    }
}