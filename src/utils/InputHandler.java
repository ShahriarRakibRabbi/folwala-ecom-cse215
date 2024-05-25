package utils;

import java.util.Scanner;

public class InputHandler {
  private static Scanner scanner = new Scanner(System.in);

  public static String readString(String prompt) {
    System.out.print(prompt);
    return scanner.nextLine();
  }

  public static int readInt(String prompt) {
    System.out.print(prompt);
    while (!scanner.hasNextInt()) {
      System.out.print("Invalid input.\nPlease enter a number: ");
      scanner.next();
    }
    return scanner.nextInt();
  }

  public static String getValidatedInput(String prompt) {
    String input;
    do {
      System.out.print(prompt);
      input = scanner.nextLine();
      if (!Validator.isValid(input)) {
        System.out.println("Invalid input. Please try again.");
      }
    } while (!Validator.isValid(input));
    return input;
  }

  public static int readChoice(int totalOptions) {
    DisplayManager.print("Option: ");
    String input = scanner.nextLine();

    if (input.matches("[0-9]")) {
      int choice = Integer.parseInt(input);
      return choice >= 1 && choice <= totalOptions ? choice : -1;
    }
    return -1;
  }
}
