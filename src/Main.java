import controllers.InventoryController;
import controllers.OrderController;
import controllers.ProductController;
import controllers.UserController;
import utils.ConsoleUtils;
import utils.DisplayManager;
import utils.InputHandler;

public class Main {

    public static void main(String[] args) {
        ConsoleUtils.clearScreen();

        boolean running = true;

        while (running) {
            ConsoleUtils.clearScreen();

            UserController.checkAuthentication();
            if (UserController.isAuthenticated()) {
                if (UserController.isAdmin()) {
                    showAdminMainMenu();
                } else {
                    showMainMenu();
                }
                continue;
            }

            DisplayManager.printTitle("Welcome to Folwala");

            String[] options = { "Login", "Register", "Exit" };
            DisplayManager.showMenu(options);
            int choice = InputHandler.readChoice(options.length);
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

        DisplayManager.showMessage("Select an option");
        DisplayManager.showMenu(options);

        int choice = InputHandler.readChoice(options.length);
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
                "Product List",
                "Add Product",
                "Logout"
        };
        DisplayManager.showMenu(options);
        int choice = InputHandler.readChoice(options.length);
        switch (choice) {
            case 1:
                OrderController.showOrders();
                break;
            case 2:
                InventoryController.showProducts();
                break;
            case 3:
                InventoryController.addProduct();
                break;
            case 4:
                UserController.logoutUser();
                break;
            default:
                DisplayManager.showErrorMessage("Invalid choice. Please try again.");
                ConsoleUtils.wait(2);
        }
        DisplayManager.showMenu(options);
    }
}
