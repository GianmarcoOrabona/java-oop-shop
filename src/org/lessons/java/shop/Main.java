package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Importo lo scanner
        Scanner scanner = new Scanner(System.in);

        // Chiedo all'utente il nome del nuovo prodotto
        System.out.println("Insert the product's name: ");
        String name = scanner.nextLine();

        // Chiedo all'utente la descrizione del nuovo prodotto
        System.out.println("Insert the product's description: ");
        String description = scanner.nextLine();

        // Chiedo all'utente il prezzo del nuovo prodotto
        System.out.println("Insert the product's price: ");
        double price = Double.parseDouble(scanner.nextLine());

        // Chiedo all'utente l'iva
        System.out.println("Insert the current VAT: ");
        double vat = Double.parseDouble(scanner.nextLine());

        // Chiedo all'utente la categoria del prodotto
        System.out.println("Insert the product's category: ");
        String categoryName = scanner.nextLine();

        // Chiedo all'utente la descrizione della categoria
        System.out.println("Insert the category's description: ");
        String categoryDescription = scanner.nextLine();

        // Creo una nuova categoria con le informazioni date
        Category category = new Category(categoryName, categoryDescription);

        // Creo un nuovo prodotto con le informazioni date
        Product product = new Product(name, description, price, vat);
        product.setCategory(category);

        // Stampo a video
        System.out.println(product.getProductInfo());

        // Chiudo lo scanner
        scanner.close();

    }
}
