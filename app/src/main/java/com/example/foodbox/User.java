package com.example.foodbox;

import java.util.ArrayList;

class User {

    private String username;
    private String password;
    private String emailAddress;
    private String phoneNumber;

    // cuman diketik aja dulu hehe
    private int userID;
    private ArrayList<Integer> borrowedFoodWrap = new ArrayList<>(); // cuman diketik aja dulu hehe
    private ArrayList<Integer> transanctionPerformed = new ArrayList<>();

    public User(String username, String password, String address) {
        this.username = username;
        this.password = password;
        this.emailAddress = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
