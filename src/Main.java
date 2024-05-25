import java.io.Console;

import controllers.ProductController;
import controllers.UserController;
import models.Product;
import models.User;
import utils.ConsoleUtils;
import utils.DisplayManager;
import utils.InputHandler;

public class Main {

    public static void main(String[] args) {
        ConsoleUtils.clearScreen();

        boolean running = true;

        while (running) {
            ConsoleUtils.clearScreen();

            if (UserController.isAuthenticated()) {
                if (UserController.isAdmin()) {
                    showAdminMainMenu();
                }
                showMainMenu();
                continue;
            }

            DisplayManager.printTitle("Welcome to Folwala");

            String[] options = { "Login", "Register", "Exit" };
            DisplayManager.showMenu(options);
            int choice = InputHandler.readChoice(1, options.length);
            switch (choice) {
                case 1:
                    UserController.loginUser();
                    break;
                case 2:
                    UserController.registerUser();
                    break;
                case 3:
                    DisplayManager.printExitSequence();
                    running = false;
                    break;
                default:
                    DisplayManager.showErrorMessage("Invalid choice. Please try again.");
                    ConsoleUtils.wait(2);
            }
        }
    }

    private static void showMainMenu() {
        DisplayManager.printTitle("Welcome " + UserController.getCurrentUser().getName() + " to Folwala");

        String[] options = {
                "View Fruits",
                "Search Fruits",
                "View Cart",
                "My Orders",
                "My Profile",
                "Logout"
        };
        DisplayManager.showMenu(options);

        int choice = InputHandler.readChoice(1, options.length);
        switch (choice) {
            case 1:
                ProductController.showCategories();
                break;
            case 2:
                ProductController.showCart();
                break;
            case 3:
                break;
            case 4:
                UserController.showOrders();
                break;
            case 5:
                break;
            case 6:
                UserController.logoutUser();
                break;
            default:
                DisplayManager.showErrorMessage("Invalid choice. Please try again.");
                ConsoleUtils.wait(2);
        }
    }

    private static void showAdminMainMenu() {
        DisplayManager.printTitle("Welcome " + UserController.getCurrentUser().getName());

        String[] options = {
                "Orders",
                "Inventory",
                "Logout"
        };
        DisplayManager.showMenu(options);
    }
}
