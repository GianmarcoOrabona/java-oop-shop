package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        Product product = new Product("Chitarra", "Chitarra elettrica", 100.99, 22);

        System.out.println(product.getProductInfo());

    }
}
