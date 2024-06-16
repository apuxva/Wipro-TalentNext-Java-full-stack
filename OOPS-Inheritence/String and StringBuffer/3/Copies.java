//Given a string, return a new string made of 'n' copies of the first 
//2 chars of the original string where 'n' is the length of the string.

import java.util.Scanner;

public class Copies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        scanner.close();
        String str2 = str.substring(0, 2);
        int len = str.length();
        String str3 = "";
        for(int i = 0 ; i <len ; i ++){
            str3 += str2;
        }
        System.out.println(str3);

    }
    
}
