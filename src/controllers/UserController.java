package controllers;

import java.io.Console;

import models.User;
import utils.ConsoleUtils;
import utils.DisplayManager;
import utils.InputHandler;

public class UserController {

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

}
