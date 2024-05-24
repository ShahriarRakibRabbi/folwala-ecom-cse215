javaCopy code
package utils;

import models.Product;
import models.Order;
import java.util.List;

public class DisplayManager {

    public void showMenu(String[] options) {
        System.out.println("Please select an option:");
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    public void showProductList(List<Product> products) {
        System.out.println("Available Products:");
        for (Product product : products) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
    }

    public void showOrderDetails(Order order) {
        System.out.println("Order Details:");
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Total Amount: $" + order.getTotalAmount());
        System.out.println("Order Date: " + order.getOrderDate());
        // Additional details
    }

    public void showErrorMessage(String message) {
        System.out.println("Error: " + message);
    }
}
