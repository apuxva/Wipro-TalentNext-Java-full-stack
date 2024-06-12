//Write a program to print the sum of all the digits of a given number.
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        String input;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string of single-digit integers separated by spaces: ");
            input = scanner.nextLine();
        }

        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= '0' && ch <= '9') {
                sum += ch - '0';
            }
        }

        System.out.println("The sum of the integers is: " + sum);
    }
}

