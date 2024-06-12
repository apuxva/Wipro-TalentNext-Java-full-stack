//Write a program to reverse a given number and print
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter few numbers to be reversed: ");
        String input = scanner.nextLine();
        scanner.close();
        int length = input.length();
        int index = length - 1 ; 
        String rinput = "";
        while(index>=0){
            rinput += input.charAt(index);
            index--;
        }
        System.out.println("The Original String:" + input);
        System.out.println("The Reversed String:" + rinput);
    }
}
