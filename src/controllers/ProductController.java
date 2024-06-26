package controllers;

import java.util.ArrayList;

import models.Product;
import utils.ConsoleUtils;
import utils.DisplayManager;
import utils.InputHandler;

public class ProductController {

  public static void showCategories() {
    ConsoleUtils.clearScreen();
    DisplayManager.printTitle("Categories");
    String[] categories = { "Fleshy Fruits", "Dry Fruits", "Fruit Seeds", "Fruit Juice", "Vegetables", "Go Back" };
    DisplayManager.showMenu(categories);
    int choice = InputHandler.readChoice(categories.length);

    switch (choice) {
      case 1:
        showProducts("Fleshy Fruits");
        break;
      case 2:
        showProducts("Dry Fruits");
        break;
      case 3:
        showProducts("Fruit Seeds");
        break;
      case 4:
        showProducts("Fruit Juice");
        break;
      case 5:
        showProducts("Vegetables");
        break;
      case 6:
        break;
      default:
        DisplayManager.showErrorMessage("Invalid choice. Please try again.");
    }

  }

  private static void showProducts(String category) {
    ConsoleUtils.clearScreen();
    DisplayManager.printTitle(category);
    ArrayList<Product> products = Product.getProductsByCategory(category);

    for (Product product : products) {
      DisplayManager.printProduct(product);
    }

    DisplayManager.newLine();

    String options[] = { "Add to Cart", "Go Back" };
    DisplayManager.showMenu(options);

    int choice = InputHandler.readChoice(options.length);
    switch (choice) {
      case 1:
        CartController.addToCart();
        break;
      case 2:
        break;
      default:
        DisplayManager.showErrorMessage("Invalid choice. Please try again.");
    }
  }

  public static void showCart() {

  }

}
