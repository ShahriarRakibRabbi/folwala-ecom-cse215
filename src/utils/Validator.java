package utils;

import java.util.Scanner;

public class InputHandler {
  private Scanner scanner;

  public InputHandler() {
    scanner = new Scanner(System.in);
  }

  public String getStringInput(String prompt) {
    System.out.print(prompt);
    return scanner.nextLine();
  }

  public int getIntInput(String prompt) {
    System.out.print(prompt);
    while (!scanner.hasNextInt()) {
      System.out.println("Invalid input. Please enter a number.");
      scanner.next();
    }
    return scanner.nextInt();
  }

  public String getValidatedInput(String prompt, Validator validator) {
    String input;
    do {
      System.out.print(prompt);
      input = scanner.nextLine();
      if (!validator.isValid(input)) {
        System.out.println("Invalid input. Please try again.");
      }
    } while (!validator.isValid(input));
    return input;
  }
}
