package org.lessons.java.shop;

import java.util.Random;

public class Product {
    // ATTRIBUTI
    private int code;
    private String name;
    private String description;
    private double price;
    private double vat;

    // COSTRUTTORI

    public Product(String name, String description, double price, double vat) {
        Random randomCode = new Random();
        this.code = randomCode.nextInt(1, 10001);
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

    public double getStandardPrice() {
        return price;
    }

    public double getVatPrice() {
        double vat = (price/100) * 22;
        return price + vat;
    }

    public String getProductInfo() {
        return "<-----Product----->" + '\n' +
                getCode() + " - " + getName() + '\n'+
                " " + '\n' +
                "<-----Product Info----->" + '\n' +
                "Name: " + getName() + '\n' +
                "Description: " + getDescription() + '\n' +
                "Price without VAT: " + getStandardPrice() + " €" + '\n' +
                "Price + VAT: " + getVatPrice() + " €" + '\n' +
                "Product Code: " + getCode() + '\n';
    }

}
