package utils;

import models.Product;

public class DisplayManager {

    public static void showMessage(String message) {
        System.out.println(message);
    }

    public static void print(String message) {
        System.out.print(message);
    }

    public static void printTitle(String title) {
        System.out.println("======= " + title + " =======");
        System.out.println();
    }

    public static void showMenu(String[] options) {
        for (int i = 0; i < options.length; i++) {
            System.out.println("\t" + (i + 1) + ". " + options[i]);
        }
        System.out.println();
    }

    public static void showErrorMessage(String message) {
        System.out.println("Error: " + message);
    }

    public static void printExitSequence() {
        ConsoleUtils.clearScreen();
        System.out.println("Thank you for shopping with us! :)\n");
        ConsoleUtils.wait(1);
        System.out.print("Exiting");
        for (int i = 0; i < 3; i++) {
            ConsoleUtils.wait(1);
            System.out.print(".");
        }
    }

    public static void showProduct(Product product) {
        System.out.println("Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Unit: " + product.getUnit());
        System.out.println();
    }
}
