package utils;

public class Menu {

  public static void showUnauthenticatedMenu() {
    String[] options = { "Login", "Register", "Exit" };
    DisplayManager.showMenu(options);
  }

  public static void showMainMenu() {
    String[] options = {
        "View Fruits",
        "Search Fruits",
        "My Orders",
        "My Profile",
        "Logout"
    };
    DisplayManager.showMenu(options);
  }

}