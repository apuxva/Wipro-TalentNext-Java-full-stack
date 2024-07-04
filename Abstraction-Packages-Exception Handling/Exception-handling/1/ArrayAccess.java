/*Write a program that takes as input the size of the array and the elements in the array. The program then asks the user to enter a particular index and prints the element at that index. Index starts from zero.
This program may generate Array Index Out Of Bounds Exception or
NumberFormatException. Use exception handling mechanisms to handle this exception. */

import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the elements of the array
        System.out.println("Enter the elements in the array (space-separated):");
        String[] input = scanner.nextLine().split(" ");
        int[] array = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }

        try {
            // Get the index to access
            System.out.println("Enter the index of the array element you want to access:");
            int index = scanner.nextInt();

            // Access and print the array element at the given index
            System.out.println("The array element at index " + index + " = " + array[index]);
            System.out.println("The array element successfully accessed");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
        }

        scanner.close();
    }
}
