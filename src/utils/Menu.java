package utils;

public class Menu {

  public void showMainMenu() {
    String[] options = { "View Products", "View Cart", "View Orders", "Profile", "Logout" };
    DisplayManager displayManager = new DisplayManager();
    displayManager.showMenu(options);
  }

  public void showUserMenu() {
    String[] options = { "Edit Profile", "View Order History", "Back to Main Menu" };
    DisplayManager displayManager = new DisplayManager();
    displayManager.showMenu(options);
  }

  public void showAdminMenu() {
    String[] options = { "Add Product", "Update Product", "View Orders", "Manage Inventory", "Back to Main Menu" };
    DisplayManager displayManager = new DisplayManager();
    displayManager.showMenu(options);
  }
}