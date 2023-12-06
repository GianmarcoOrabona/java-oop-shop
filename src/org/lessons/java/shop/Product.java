package org.lessons.java.shop;

public class Product {
    // ATTRIBUTI
    private int code;
    private String name;
    private String description;
    private double price;
    private double vat;

    // COSTRUTTORI

    public Product(int code, String name, String description, double price, double vat) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vat;
    }


    // GETTER E SETTER

    public int getCode() {
        return code;
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

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }


    // METODI

}
