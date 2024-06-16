
import java.util.Scanner;

//Write a java program that will concatenate 2 strings and return the result. The result should be in lowercase.
public class Concate {
    public static void main(String[] args) {
        String str1;
        String str2;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first string: ");
            str1 = scanner.nextLine();
            System.out.print("Enter the second string: ");
            str2 = scanner.nextLine();
        }
        //System.out.println(str1);
        //System.out.println(str2);
        String concat = str1.concat(str2);
        System.out.println(concat.toLowerCase());
    }
    
}
