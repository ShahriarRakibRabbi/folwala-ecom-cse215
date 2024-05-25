package utils;

import java.io.IOException;

public class ConsoleUtils {

  public static void clearScreen() {
    try {
      if (System.getProperty("os.name").contains("Windows")) {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
      } else {
        System.out.print("\033[H\033[2J");
        System.out.flush();
      }
    } catch (IOException | InterruptedException ex) {
      DisplayManager.showErrorMessage("Could not clear the screen.");
    }
  }

  public static void waitForEnter() {
    try {
      System.in.read();
    } catch (IOException ex) {
      DisplayManager.showErrorMessage("Could not read input.");
    }
  }

  public static void wait(int seconds) {
    try {
      Thread.sleep(seconds * 1000);
    } catch (InterruptedException ex) {
      DisplayManager.showErrorMessage("Thread was interrupted.");
    }
  }

}