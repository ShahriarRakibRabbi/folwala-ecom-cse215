package controllers;

import models.User;
import utils.ConsoleUtils;
import utils.DisplayManager;
import utils.InputHandler;

public class UserController {

  private static User currentUser;
  private static boolean isAuthenticated;

  public static void registerUser() {
    ConsoleUtils.clearScreen();
    DisplayManager.printTitle("Register");

    String name = InputHandler.readString("Name: ");
    String email = InputHandler.readString("Email: ");
    String password = InputHandler.readString("Password: ");
    String address = InputHandler.readString("Address: ");
    String phone = InputHandler.readString("Phone: ");

    User user = new User(name, email, password, address, phone);
    user.save();

    DisplayManager.showMessage("User registered successfully!");
    ConsoleUtils.wait(2);
  }

  public static void loginUser() {
    isAuthenticated = true;
  }

  public static boolean isAuthenticated() {
    return isAuthenticated;
  }

  public static void logoutUser() {
    isAuthenticated = false;
  }

  public static void showOrders() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'showOrders'");
  }

  public static void showProfile() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'showProfile'");
  }

}
