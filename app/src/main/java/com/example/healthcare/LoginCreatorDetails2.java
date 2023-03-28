package com.example.healthcare;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;

public class LoginCreatorDetails2 extends AppCompatActivity {

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.Rb1:
                if (checked)

                    break;
            case R.id.radioButton:
                if (checked)

                    break;
        }

        switch(view.getId()) {
            case R.id.Rb2:
                if (checked)

                    break;
            case R.id.radioButton2:
                if (checked)

                    break;
        }
        switch(view.getId()) {
            case R.id.Rb3:
                if (checked)

                    break;
            case R.id.radioButton3:
                if (checked)

                    break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_creator_details2);


    }
}