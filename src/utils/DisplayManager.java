package utils;

import models.Product;

public class DisplayManager {
    public static void showMessage(String message) {
        System.out.println(message);
    }

    public static void showSuccessMessage(String message) {
        System.out.println(Color.GREEN + message + Color.RESET);
    }

    public static void newLine() {
        System.out.println();
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
            System.out.println(Color.GREEN + "\t" + (i + 1) + ". " + options[i] + Color.RESET);
        }
        System.out.println();
    }

    public static void showErrorMessage(String message) {
        System.out.println(Color.RED + "Error: " + message + Color.RESET);
    }

    public static void printExitSequence() {
        ConsoleUtils.clearScreen();
        System.out.println("Thank you for shopping with us! :)\n");
        ConsoleUtils.wait(1);
        System.out.print(Color.RED + "Exiting");
        for (int i = 0; i < 3; i++) {
            ConsoleUtils.wait(1);
            System.out.print(".");
        }
    }

    public static void printProduct(Product product) {
        System.out.println(
                product.getProductID() + ". " +
                        product.getName() +
                        " (" + product.getUnit() + ") - " +
                        (int) product.getPrice() + " BDT");
    }
}
