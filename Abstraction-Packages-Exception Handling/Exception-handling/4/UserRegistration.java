import java.util.Scanner;

// Step 1: Create a user-defined exception class named "InvalidCountryException"
class InvalidCountryException extends Exception {
    // Default constructor
    public InvalidCountryException() {
        super();
    }

    // Constructor that accepts a message
    public InvalidCountryException(String message) {
        super(message);
    }
}

public class UserRegistration {
    // Step 3: Add the registerUser method
    public void registerUser(String username, String userCountry) throws InvalidCountryException {
        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException("User Outside India cannot be registered");
        } else {
            System.out.println("User registration done successfully");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserRegistration registration = new UserRegistration();

        try {
            System.out.println("Enter username:");
            String username = scanner.nextLine();

            System.out.println("Enter country:");
            String country = scanner.nextLine();

            registration.registerUser(username, country);
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
