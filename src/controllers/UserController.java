package controllers;

import models.Product;
import models.User;
import utils.ConsoleUtils;
import utils.DisplayManager;
import utils.InputHandler;

public class UserController {

  private static User currentUser;
  private static boolean isAuthenticated = false;
  private static boolean isAdmin = false;

  public static void registerUser() {
    ConsoleUtils.clearScreen();
    DisplayManager.printTitle("Register");

    String name = InputHandler.readString("Name: ");
    String phone = InputHandler.readString("Phone: ");
    String password = InputHandler.readString("Password: ");
    String address = InputHandler.readString("Address: ");

    User user = new User(name, phone, password, address);
    user.save();

    DisplayManager.showMessage("User registered successfully!");
    ConsoleUtils.wait(2);
  }

  public static void loginUser() {
    ConsoleUtils.clearScreen();
    DisplayManager.printTitle("Login");

    String phone = InputHandler.readString("Phone: ");
    String password = InputHandler.readString("Password: ");

    User user = User.getUserByPhone(phone);

    if (user == null || !user.getPassword().equals(password)) {
      DisplayManager.showErrorMessage("Invalid phone or password. Please try again.");
      ConsoleUtils.wait(2);
      return;
    }
    currentUser = user;

    if (currentUser.isAdmin()) {
      isAdmin = true;
    }

    DisplayManager.showMessage("Login successful!");
    ConsoleUtils.wait(2);
    isAuthenticated = true;
  }

  public static boolean isAuthenticated() {
    return isAuthenticated;
  }

  public static void logoutUser() {
    currentUser = null;
    isAuthenticated = false;
  }

  public static void showOrders() {
  }

  public static void showProfile() {
  }

  public static User getCurrentUser() {
    return currentUser;
  }

  public static boolean isAdmin() {
    return isAdmin;
  }

}
