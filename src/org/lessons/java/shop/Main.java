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

        // Creo un nuovo prodotto con le informazioni date
        Product product = new Product(name, description, price, vat);

        // Stampo a video
        System.out.println(product.getProductInfo());

        // Chiudo lo scanner
        scanner.close();

    }
}
