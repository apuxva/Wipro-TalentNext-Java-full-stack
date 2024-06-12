/*Write a program to find the biggest number in a 3*3 array. 
The program is supposed to receive 9 integer numbers as command line arguments. */
public class Bignum {

    public static void main(String[] args) {
        if (args.length != 9) {
            System.out.println("Please enter exactly 9 integer arguments.");
            return;
        }

        int[][] arr = new int[3][3];

        // Parse arguments and populate the array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                try {
                    arr[i][j] = Integer.parseInt(args[i * 3 + j]);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid argument: " + args[i * 3 + j]);
                    return;
                }
            }
        }

        int largest = findLargest(arr);  // Call separate method

        System.out.println("Largest element in the array: " + largest);
    }

    // Method to find the largest element in the 2D array
    private static int findLargest(int[][] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                largest = Math.max(largest, arr[i][j]);
            }
        }
        return largest;
    }
}
