/*Print an array that contains the exact same numbers as the given array, 
but rearranged so that all the even numbers come before all the odd numbers. 
Other than that, the numbers can be in any order. You may modify and print 
the given array, or make a new array. */
public class Evenodd {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 4, 5, 4, 6, 7, 8, 9};
        int len = arr.length;

        int i ;  // Use the existing i for iteration

        for (i = 0; i < len; i++) {
            if (arr[i] % 2 == 0) { // If even number
                int temp = arr[i];  // Use temp for temporary storage
                arr[i] = arr[len - 1 - i];  // Swap with element from the right end (initially points to last element)
                arr[len - 1 - i] = temp;  // Move the odd number to the right end
            }
        }

        // Print the modified array
        System.out.print("Modified array: ");
        for (i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
