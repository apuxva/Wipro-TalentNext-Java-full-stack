// Write a java program that will return the first half of the string, 
// if the length of the string is even. It should return null for odd length string.
import java.util.Scanner;
public class Even {
    public static void main(String[] args) {
        String str;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the string: ");
            str = scanner.nextLine();
        }
        int n = str.length();
        if ( n %2 == 0){
            System.out.println(str.substring(0,n/2));
        }
        else{
            System.out.println("null");
        }
    }
}
