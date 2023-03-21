package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Toast;

import java.util.HashMap;

public class login_creator_details extends AppCompatActivity {

    MultiAutoCompleteTextView multiAutoCompleteTextViewDefault;
    String[] professions = {"Doctor", "Pharmacist", "Nurse", "Cardiologist", "Critical Care Medicine Physician Assistant", "Dentist", "Dermatologist",
            "Dietitian", "Genetic Counselor/Counsellor", "Occupational Therapist", "Nephrologist", "Neurologist", "Neuropsychologist" , "Pathologist" , "General practitioner","Psychiatrist",
    "Psychologist","Mental Health Counselor","Yoga Instructor","Physical Therapist","Sport Psychologist","Gynaecologist","General Doctor","Medical Student"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_creator_details);

        //Declare elements
        EditText name = findViewById(R.id.name_data);
        EditText lastName = findViewById(R.id.lastname_data);
        EditText number = findViewById(R.id.editTextPhone);
        EditText email = findViewById(R.id.editTextTextEmailAddress);
        EditText address = findViewById(R.id.editTextTextPostalAddress);
        EditText profession = findViewById(R.id.multiAutoCompleteTextView);



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
                boolean data_check = true;
                if(isEmpty(name)){
                    name.setError("First Name is required.");
                    data_check = false;
                }
                if(isEmpty(lastName)){
                    lastName.setError("Last Name is required.");
                    data_check = false;
                }
                if(isEmpty(email)){
                    email.setError("Email address is required.");
                    data_check = false;
                }
                if(isEmail(email) == false){
                    email.setError("Email address is not correct.");
                    data_check = false;
                }
                if(isEmpty(number)){
                    number.setError("Phone number is required.");
                    data_check = false;
                }

                if(isEmpty(address)){
                    address.setError("Address is required.");
                    data_check = false;
                }
                if(isEmpty(profession)){
                    profession.setError("Profession is required.");
                    data_check = false;
                }

                if(data_check){
                    HashMap<String,String> map = RecieveData(name,lastName,email,number,address,profession);
                }
            }
        });

    }

    HashMap<String,String> RecieveData(EditText firstName, EditText lastName, EditText email, EditText number, EditText address, EditText profession){
        HashMap<String,String> map = new HashMap<>();
        map.put("First name",firstName.getText().toString());
        map.put("Last name",lastName.getText().toString());
        map.put("Email",email.getText().toString());
        map.put("Address",address.getText().toString());
        map.put("Phone Number",number.getText().toString());
        map.put("Profession",profession.getText().toString());

        return map;
    }

    boolean isEmpty(EditText text) {
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }

    boolean isEmail(EditText text) {
        CharSequence email = text.getText().toString();
        return (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
}