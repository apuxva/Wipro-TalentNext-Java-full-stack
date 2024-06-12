//Write a program to print * in Floyds format (using for and while loop)
import java.util.Scanner;

public class Floyds {
    public static void main(String[] args) {
        int x;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            x = scanner.nextInt();
        }
        for (int i = 0; i <=x; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }   
}
