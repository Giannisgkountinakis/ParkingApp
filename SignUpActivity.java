package com.example.parkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class SignUpActivity extends AppCompatActivity {

    private static ArrayList<User> registeredUsers = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        EditText insertName = findViewById(R.id.insertName);
        EditText insertEmail = findViewById(R.id.inserttEmail);
        EditText insertPassword = findViewById(R.id.insertPassword);

        Button signupButton = findViewById(R.id.signUp);

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Παίρνουμε τις τιμές από τα EditText
                String name = insertName.getText().toString().trim();
                String email = insertEmail.getText().toString().trim();
                String password = insertPassword.getText().toString().trim();


                //Add a new register in the array
                registeredUsers.add(new User(name, password, email));
                System.out.println("User added successfully! \n");

                Intent intent = new Intent(SignUpActivity.this,LoginActivity.class);
                startActivity((intent));
            }

        });
    }

    public static ArrayList<User> RegisteredUsers(){
        return registeredUsers;
    }
}
