import java.io.Console;

import controllers.UserController;
import utils.ConsoleUtils;
import utils.DisplayManager;
import utils.InputHandler;
import utils.Menu;

public class Main {

    public static void main(String[] args) {

        boolean running = true;

        while (running) {
            ConsoleUtils.clearScreen();
            Menu.showUnauthenticatedMenu();
            int choice = InputHandler.readInt("Enter your choice: ");
            switch (choice) {
                case 1:
                    UserController.loginUser();
                    break;
                case 2:
                    UserController.registerUser();
                    break;
                case 3:
                    DisplayManager.showMessage("Exiting...");
                    running = false;
                    break;
                default:
                    DisplayManager.showErrorMessage("Invalid choice. Please try again.");
                    ConsoleUtils.wait(2);
            }
        }
    }
}
