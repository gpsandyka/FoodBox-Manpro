package com.example.foodbox;

import android.icu.text.UnicodeSet;

import java.util.ArrayList;

class DatabaseFoodBox {

    private static ArrayList<FoodBox> FOODBOX_DATABASE = new ArrayList<>();
    private static int LAST_FOODBOX_ID = 0;

    public static ArrayList<FoodBox> getFoodboxDatabase() {
        return FOODBOX_DATABASE;
    }

    public static void setFoodBoxDatabase(ArrayList<FoodBox> userDatabase) {
        FOODBOX_DATABASE = userDatabase;
    }

    public static int getLastUserId() {
        return LAST_FOODBOX_ID;
    }

    public static boolean addFoodBox(FoodBox user) {
        FOODBOX_DATABASE.add(user);
        return true;
    }

    public static boolean removeFoodBox(FoodBox foodBox) {
        FOODBOX_DATABASE.remove(foodBox);
        return false;
    }

    public static FoodBox searchFoodBoxByID(int ID) {
        for (FoodBox user : FOODBOX_DATABASE) {
            if (user.getFoodboxID() == ID) {
                return user;
            }
        }
        return null;
    }
}