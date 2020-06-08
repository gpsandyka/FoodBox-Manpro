package com.example.foodbox;

enum Status {
    AVAILABLE, BORROWED
}

public class FoodBox {

    private final String foodboxID; //kode tanggal produksi + warna BGR decimal (111 = 8 putih, 000 = 0 hitam) + nomor produksi
    private String size; //harusnya enum
    private String name;
    private int price;
    private Status status;
    private String color; //harusnya enum

    public FoodBox(String size, int price, String color, String foodboxID) {
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

    public String getFoodboxID() {
        return foodboxID;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
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
