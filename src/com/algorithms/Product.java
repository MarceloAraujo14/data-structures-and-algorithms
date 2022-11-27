package com.algorithms;


public class Product {
    private String brand;
    private Double price;

    public String getBrand() {
        return brand;
    }

    public Double getPrice() {
        return price;
    }

    public Product(String brand, Double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "brand='" + brand + '\'' +
                ", price=" + price;
    }
}
