package com.prakerja;

public class Latihan2 {
    private String name;
    private String description;
    private double price;
    private int stock;

    public Latihan2(String name, String description, double price, int stock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void getInfo() {
        System.out.println("====");
        System.out.println("INFO PRODUK");
        System.out.println("Nama : " + name);
        System.out.println("Deskripsi : " + description);
        System.out.println("Harga : " + price);
        System.out.println("Jumlah Stok : " + stock);
        System.out.println("====");
    }

    public static void main(String[] args) {
        Latihan2 product1 = new Latihan2("coffee", "this is coffee", 15000, 10);
        product1.getInfo();

        Latihan2 product2 = new Latihan2("milk", "this is fresh milk", 25000, 10);
        product2.getInfo();

        Latihan2 product3 = new Latihan2("apple juice", "this is juice", 18000, 20);
        product3.getInfo();
    }
}

