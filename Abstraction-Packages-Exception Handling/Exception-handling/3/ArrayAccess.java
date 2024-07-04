/*Write a Program to take care of Number Format Exception if user enters values other than integer for calculating average marks of 2 students. The name of the students and marks in 3 subjects are taken from the user while executing the program.
In the same Program write your own Exception classes to take care of Negative values and values out of range (i.e. other than in the range of 0-100) */

import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Get the size of the array
            System.out.println("Enter the number of elements in the array");
            int n = Integer.parseInt(scanner.nextLine());
            
            // Get the elements of the array
            int[] array = new int[n];
            System.out.println("Enter the elements in the array");
            for (int i = 0; i < n; i++) {
                array[i] = Integer.parseInt(scanner.nextLine());
            }
            
            // Get the index to access
            System.out.println("Enter the index of the array element you want to access");
            int index = Integer.parseInt(scanner.nextLine());
            
            // Access and print the array element at the given index
            System.out.println("The array element at index " + index + " = " + array[index]);
            System.out.println("The array element successfully accessed");
        
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception");
        } finally {
            scanner.close();
        }
    }
}

