package com.example.parkingapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText insertEmail = findViewById(R.id.emailInput);
        EditText insertPassword = findViewById(R.id.passwordInput);

        Button logInButton = findViewById(R.id.loginbtn);


        logInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = insertEmail.getText().toString().trim();
                String password = insertPassword.getText().toString().trim();

                ArrayList<User> registeredUsers = SignUpActivity.RegisteredUsers();

                for (int i=0; i<registeredUsers.size(); i++) {

                    //Checks if the username that the user entered exists
                    boolean correctEmail = registeredUsers.get(i).hasEmail(email);
                    if (correctEmail) {
                        //Checks if the password that the user entered exists for the username
                        boolean correctPassword = registeredUsers.get(i).hasPassword(password);
                        if (correctPassword){
                            System.out.println("Success login");
                        }
                        else {
                            System.out.println("Incorrect password");
                        }
                    }
                    else {
                        System.out.println("Incorrect username or password");
                    }

                }
            }
        });
    }
}