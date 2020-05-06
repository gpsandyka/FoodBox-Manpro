package com.example.foodbox;

public class FoodBox {

    private int foodboxID;
    private String size; //harusnya enum
    private String name;
    private String price;
    private String status; //harusnya enum
    private String color; //harusnya enum

    public FoodBox(String size, String price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }
    public boolean borrowFoodBox(User user, FoodBox[] foodbox) {
        for (FoodBox fb : foodbox) {
            user.addBorrowedFoodBox(fb);
        }
        return true;
    }

    public boolean returnFoodBox(User user, FoodBox[] foodbox) {
        for (FoodBox fb : foodbox) {
            user.removeBorrowedFoodBox(fb);
        }
        return true;
    }

    public int getFoodboxID() {
        return foodboxID;
    }

    public void setFoodboxID(int foodboxID) {
        this.foodboxID = foodboxID;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
