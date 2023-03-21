package com.example.healthcare;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class UserActivity extends AppCompatActivity {

    private EditText email;
    private EditText password;
    private Button register;
    private ImageButton button2;
    private FirebaseAuth auth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user2);

        email= findViewById(R.id.editTextEmail);
        password = findViewById(R.id.editTextPassword);
        register=findViewById(R.id.button2);
        auth= FirebaseAuth.getInstance();



        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text_email=email.getText().toString();
                String text_password=password.getText().toString();
                if(TextUtils.isEmpty(text_email)){
                    email.setError("Empty Credentials");
                }
                if(TextUtils.isEmpty(text_password)){
                    password.setError("Empty Credentials");
                }
                else if(!isEmail(email)){
                    email.setError("Email address is not correct.");
                }
                else if(text_password.length() <6){
                    password.setError("password too short");
                }else{
                    registerUser(text_email,text_password);
                }
            }
        });




    }

    boolean isEmail(EditText text) {
        String email = text.getText().toString();
        return (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }

    private void registerUser(String email, String password) {
        auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(UserActivity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(UserActivity.this,"Registerd successfully",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(UserActivity.this,"Registeration failed ",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

}