import java.io.Console;

import controllers.ProductController;
import controllers.UserController;
import models.Product;
import models.User;
import utils.ConsoleUtils;
import utils.DisplayManager;
import utils.InputHandler;
import utils.Menu;

public class Main {

    public static void main(String[] args) {
        ConsoleUtils.clearScreen();

        boolean running = true;

        while (running) {
            ConsoleUtils.clearScreen();

            if (UserController.isAuthenticated()) {
                mainMenu();
                continue;
            }

            DisplayManager.printTitle("Welcome to Folwala");

            Menu.showUnauthenticatedMenu();
            int choice = InputHandler.readChoice(1, 3);
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

    private static void mainMenu() {
        DisplayManager.printTitle("Welcome {User Name}");

        Menu.showMainMenu();

        int choice = InputHandler.readChoice(1, 5);
        switch (choice) {
            case 1:
                ProductController.showProducts();
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
}
