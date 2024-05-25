package utils;

public class Menu {

  public static void showUnauthenticatedMenu() {
    String[] options = { "Login", "Register", "Exit" };
    DisplayManager.showMenu(options);
  }

}