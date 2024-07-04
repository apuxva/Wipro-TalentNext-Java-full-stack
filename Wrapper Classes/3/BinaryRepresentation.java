/*Write a Java program that reads an integer number (between 1 and 255) from the user and prints 
the binary representation of the number. The answer should be printed as a String.
Note: The output displayed should contain 8 digits and should be padded with leading Os (zeros), 
in case the returned String contains less than 8 characters */

import java.util.Scanner;

public class BinaryRepresentation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 255: ");
        int number = scanner.nextInt();
        if (number < 1 || number > 255) {
            System.out.println("Invalid input. Please enter a number between 1 and 255.");
        } else {
            String binaryString = Integer.toBinaryString(number);
            String formattedBinaryString = String.format("%8s", binaryString).replace(' ', '0');
            System.out.println("Binary representation: " + formattedBinaryString);
        }

        // Close the scanner
        scanner.close();
    }
}
