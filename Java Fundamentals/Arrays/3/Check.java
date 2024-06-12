/*Write a program to initialize an integer array with values and check if 
a given number is present in the array or not. */
import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        int[]arr=new int[]{2,5,7,8,45,50,90};
        int x;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            x = scanner.nextInt();
        }
        boolean found = false;
        int n = 0;
        for(int i =0; i<arr.length;i++){
            if(arr[i]==x){
                found = true;
                n = i;
                break;
            }
        }
        if(found)
        System.out.println("The given integer " + x + " is found at the index " + n);
        else{
            System.out.println("-1");
        }

    }
    
}
