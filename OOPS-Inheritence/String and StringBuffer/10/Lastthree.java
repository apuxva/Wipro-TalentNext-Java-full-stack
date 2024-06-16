/*Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string.
You may assume that n is between 0 and the length of the string, inclusive.
1/p:Wipro, 3
o/p:propropro.   */

import java.util.Scanner;

public class Lastthree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        scanner.close();
        int l = str.length();

        String str2 = str.substring(l-3, l );
        String str3 = "";
        for(int i = 0 ; i <n; i ++){
            str3 += str2;
        }
        System.out.println(str3);

    }
    
}
