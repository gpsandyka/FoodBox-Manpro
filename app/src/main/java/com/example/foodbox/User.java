package com.example.foodbox;

import java.util.ArrayList;

class User {

    private String name;
    private String password;
    private String emailAddress;
    private String phoneNumber;

    // cuman diketik aja dulu hehe
    private int userID;
    private ArrayList<FoodBox> borrowedFoodBox = new ArrayList<>(); // cuman diketik aja dulu hehe
    private ArrayList<Integer> transanctionPerformed = new ArrayList<>();

    public User(String username, String noTelp, String password, String address) {
        this.name = username;
        this.password = password;
        this.emailAddress = address;
        this.phoneNumber = noTelp;
    }

    public boolean addBorrowedFoodBox (FoodBox foodbox) {
        try {
            borrowedFoodBox.add(foodbox);
        }
        catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean removeBorrowedFoodBox (FoodBox foodbox) {
        try {
            borrowedFoodBox.remove(foodbox);
        }
        catch (Exception e) {
            return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
