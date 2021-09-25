package com.example.mad3;

public class Item {
    private String Name;
    private String Price;
    private String size;
    private String composition;

    public Item() {
    }

    public Item(String Name, String price, String size, String composition) {
        this.Name = Name;
        Price = price;
        this.size = size;
        this.composition = composition;
    }

    public String getPName() {
        return Name;
    }

    public String getPrice() {
        return Price;
    }

    public String getSize() {
        return size;
    }

    public String getComposition() {
        return composition;
    }

    public void setName(String PName) {
        this.Name = PName;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }
}

