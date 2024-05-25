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

            DisplayManager.printTitle("Welcome to Folwala");
            if (UserController.isAuthenticated())
                Menu.showMainMenu();
            else
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
}
