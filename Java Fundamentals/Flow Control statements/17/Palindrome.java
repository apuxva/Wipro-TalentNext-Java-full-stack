//Write a Java program to find if the given number is palindrome or not
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String input;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter few numbers to be reversed: ");
            input = scanner.nextLine();
        }
        int length = input.length();
        int index = length - 1 ; 
        String rinput = "";
        while(index>=0){
            rinput += input.charAt(index);
            index--;
        }
        System.out.println("The Original String:" + input);
        System.out.println("The Reversed String:" + rinput);
        if (input.equals(rinput)){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome Number");
        }
    }
    
}
