package com.example.foodbox;

import android.icu.text.UnicodeSet;

import java.util.ArrayList;

class DatabaseFoodBox {

    private static ArrayList<FoodBox> FOODBOX_DATABASE = new ArrayList<>();
    private static int LAST_FOODBOX_ID = 0;

    public static ArrayList<FoodBox> getFoodboxDatabase() {
        return FOODBOX_DATABASE;
    }

    public static void setFoodBoxDatabase(ArrayList<FoodBox> FoodBoxDatabase) {
        FOODBOX_DATABASE = FoodBoxDatabase;
    }

    public static int getLastUserId() {
        return LAST_FOODBOX_ID;
    }

    public static boolean addFoodBox(FoodBox foodBox) {
        FOODBOX_DATABASE.add(foodBox);
        return true;
    }

    public static boolean removeFoodBox(FoodBox foodBox) {
        FOODBOX_DATABASE.remove(foodBox);
        return false;
    }

    public static FoodBox searchFoodBoxByID(String ID) {
        for (FoodBox user : FOODBOX_DATABASE) {
            if (user.getFoodboxID().equals(ID)) {
                return user;
            }
        }
        return null;
    }
}
