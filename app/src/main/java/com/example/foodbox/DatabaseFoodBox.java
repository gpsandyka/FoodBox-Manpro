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
        for (FoodBox foodBox : FOODBOX_DATABASE) {
            if (foodBox.getFoodboxID().equals(ID)) {
                return foodBox;
            }
        }
        return null;
    }

    public static FoodBox searchAvailableFoodBox(String size, String color) {
        for (FoodBox foodbox : FOODBOX_DATABASE) {
            if (foodbox.getStatus() == Status.AVAILABLE && foodbox.getSize().equals(size) && foodbox.getColor().equals(color)) {
                return foodbox;
            }
        }
        return null;
    }
}
