/*Write a program to receive an integer number as a command line argument, and print the binary, 
octal and hexadecimal equivalent of the given number. */

public class NumberConversion {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide exactly one integer as a command line argument.");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);

            String binary = Integer.toBinaryString(number);
            String octal = Integer.toOctalString(number);
            String hexadecimal = Integer.toHexString(number);

            System.out.println("Given Number: " + number);
            System.out.println("Binary: " + binary);
            System.out.println("Octal: " + octal);
            System.out.println("Hexadecimal: " + hexadecimal);
        } catch (NumberFormatException e) {
            System.out.println("Please provide a valid integer number.");
        }
    }
}
