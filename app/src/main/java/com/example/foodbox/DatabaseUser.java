package com.example.foodbox;

import android.icu.text.UnicodeSet;

import java.util.ArrayList;

class DatabaseUser {

    private static ArrayList<User> USER_DATABASE = new ArrayList<>();
    private static int LAST_USER_ID = 0;

    public static ArrayList<User> getUserDatabase() {
        return USER_DATABASE;
    }

    public static void setUserDatabase(ArrayList<User> userDatabase) {
        USER_DATABASE = userDatabase;
    }

    public static int getLastUserId() {
        return LAST_USER_ID;
    }

    public static boolean addUser(User user) {
        LAST_USER_ID++;
        user.setUserID(LAST_USER_ID);
        USER_DATABASE.add(user);
        return true;
    }

    public static boolean removeUser() {
        return false;
    }

    public static User loginVerification(String email, String password) {
        for (User user : USER_DATABASE) {
            if (user.getEmailAddress().equals(email) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    public static boolean signup(String emailAddress, String noTelp, String username, String password) {
        User temp = new User(username, noTelp, password, emailAddress);
        addUser(temp);
        return true;
    }
}
