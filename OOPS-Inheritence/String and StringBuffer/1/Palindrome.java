//Write a Program to check whether a given String is Palindrome or not.
import java.util.Scanner;
public class Palindrome {
    //here we can create a stringbuffer and use reverse() method to compare org and reversed string
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = scanner.nextLine();
            StringBuffer strbuff1 = new StringBuffer();
            strbuff1.append(str);
            System.out.println(strbuff1);
            strbuff1.reverse();
            String reversedString = strbuff1.toString();
            
            // Check if the original string is equal to the reversed string
            if (str.equals(reversedString)) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }
        }
    }
}
