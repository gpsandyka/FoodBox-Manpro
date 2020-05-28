package com.example.foodbox;

enum Status {
    AVAILABLE, BORROWED
}

public class FoodBox {

    private int foodboxID; //kode produksi + warna RGB (111 = putih, 000 hitam) + nomor produksi
    private String size; //harusnya enum
    private String name;
    private String price;
    private Status status;
    private String color; //harusnya enum

    public FoodBox(String size, String price, String color, int foodboxID) {
        this.size = size;
        this.price = price;
        this.color = color;
        this.foodboxID = foodboxID;
        status = Status.AVAILABLE;
    }

    public static boolean borrowFoodBox(User user, FoodBox[] foodbox) {
        for (FoodBox fb : foodbox) {
            user.addBorrowedFoodBox(fb);
            fb.setStatus(Status.BORROWED);
        }
        return true;
    }

    public static boolean returnFoodBox(FoodBox fb) {
        fb.setStatus(Status.AVAILABLE);
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}