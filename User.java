package com.example.parkingapp;

import java.util.ArrayList;

public class User {

    private String name;
    private String password;
    private String email;

    public User(String name, String passsword, String email) {
        this.name = name;
        this.password = passsword;
        this.email = email;
    }

    public void printUser() {
        System.out.println("User's details:");
        System.out.println(name);
        System.out.println(password);
        System.out.println(email);
    }

    public boolean hasEmail(String e) {
        return email.equals(e);
    }

    public boolean hasPassword(String p) {
        return password.equals(p);
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }



}
