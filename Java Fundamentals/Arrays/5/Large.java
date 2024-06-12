/*Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array. */
/*Write a program to initialize an array and print them in a sorted order. */
import java.util.*;

public class Large {
    public static void main(String[] args) {
        int arr [] = {11,22,55,66};
        int x = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        } 
        System.out.print("\n");   
        System.out.println("The smallest number in the array is : " + arr[0]);
        System.out.println("The second smallest number in the array is : " + arr[1]);
        System.out.println("The largest number in the array is : " + arr[x-1]);
        System.out.println("The second smallest number in the array is : " + arr[x-2]);
    }
}
