package controllers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

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
    isAuthenticated = true;
    isAdmin = currentUser.isAdmin();

    try {
      FileWriter fileWriter = new FileWriter("data/authenticated.txt");
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
      bufferedWriter.write(phone);
      bufferedWriter.close();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    DisplayManager.showMessage("Login successful!");
    ConsoleUtils.wait(2);
  }

  public static boolean isAuthenticated() {
    return isAuthenticated;
  }

  public static void checkAuthentication() {
    try {
      FileReader fileReader = new FileReader("data/authenticated.txt");
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      String line = bufferedReader.readLine();
      if (line != null) {
        isAuthenticated = true;
        currentUser = User.getUserByPhone(line);
        isAdmin = currentUser.isAdmin();
      }
      bufferedReader.close();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public static void logoutUser() {
    try {
      FileWriter fileWriter = new FileWriter("data/authenticated.txt");
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
      bufferedWriter.write("");
      bufferedWriter.close();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    currentUser = null;
    isAuthenticated = false;
    isAdmin = false;
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
