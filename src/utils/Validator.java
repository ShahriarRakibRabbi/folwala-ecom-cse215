package utils;

public class Validator {

    public static boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    public static boolean isValidPhoneNumber(String phone) {
        return phone.matches("\\d{10}");
    }

    public static boolean isValidPassword(String password) {
        return password.length() >= 6;
    }

    public static boolean isValid(String input) {
        // General validation logic can be added here
        return input != null && !input.trim().isEmpty();
    }
}
