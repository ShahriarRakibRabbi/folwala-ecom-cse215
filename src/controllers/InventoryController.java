package controllers;

import java.util.ArrayList;

import models.Product;
import utils.ConsoleUtils;
import utils.DisplayManager;
import utils.InputHandler;

public class InventoryController {

  public static void showInventory() {

  }

  public static void showProducts() {
    ConsoleUtils.clearScreen();
    DisplayManager.printTitle("Products");
    ArrayList<Product> products = Product.getAllProducts();

    for (Product product : products) {
      DisplayManager.printProduct(product);
    }
    ConsoleUtils.waitForEnter();
  }

  public static void addProduct() {
    ConsoleUtils.clearScreen();
    DisplayManager.printTitle("Add Product");

    int productID = Product.generateProductID();
    String name = InputHandler.readString("Name: ");
    double price = Double.parseDouble(InputHandler.readString("Price: "));
    int stockQuantity = Integer.parseInt(InputHandler.readString("Stock Quantity: "));
    String category = InputHandler.readString("Category: ");
    String unit = InputHandler.readString("Unit: ");

    Product product = new Product(productID, name, price, stockQuantity, category, unit);
    product.save();

    DisplayManager.showMessage("Product added successfully!");
    ConsoleUtils.wait(2);
  }

}
