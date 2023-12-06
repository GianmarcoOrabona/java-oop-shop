package org.lessons.java.shop;

import java.util.Random;

public class Product {
    // ATTRIBUTI
    private int code;
    private String name;
    private String description;
    private double price;
    private double vat;

    // Categoria
    private Category category;

    // COSTRUTTORI

    public Product(String name, String description, double price, double vat) {
        codeGenerator();
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vat;
    }


    // GETTER E SETTER


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

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


    // Metodo che mi genera un codice casuale
    private void codeGenerator () {
        Random randomCode = new Random();
        this.code = randomCode.nextInt(1, 10001);
    }

    // Metodo che mi calcola il prezzo con l'iva
    public double getVatPrice() {
        double vatPrice = getPrice() + (getPrice() * getVat()/100);
        return price + vatPrice;
    }

    // Metodo che mi stampa codice-nome dell'oggetto
    public String getFullName() {
        return "<-----Product----->" + '\n' +
                getCode() + " - " + getName() + '\n';
    }

    // Metodo che mi stampa le informazioni dell'oggetto
    public String getProductInfo() {
        return getFullName() +

                " " + '\n' +
                "<-----Product Info----->" + '\n' +
                "Name: " + getName() + '\n' +
                "Description: " + getDescription() + '\n' +
                "Price without VAT: " + getPrice() + " €" + '\n' +
                "Price + VAT: " + getVatPrice() + " €" + '\n' +
                "Product Code: " + getCode() + '\n' +

                " " + '\n' +
                "<-----Category----->" + '\n' +
                "Category name: " + category.getName() + '\n' +
                "Category description: " + category.getDescription();
    }

}
