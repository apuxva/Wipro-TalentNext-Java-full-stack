/*Write a Java program that accepts a string (with * in it). The program should return a new 
string in which the following characters are removed-*, the characters that are to the left 
and right of * */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = in.nextLine();
        StringBuffer str = new StringBuffer(input);
        StringBuffer newStr = new StringBuffer();

        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == '*') {
                i++;
                continue;
            }
            if (i > 0 && str.charAt(i - 1) == '*') {
                continue;
            }
            if (i < length - 1 && str.charAt(i + 1) == '*') {
                continue;
            }
            newStr.append(str.charAt(i));
        }

        System.out.println("Output: " + newStr.toString());
        in.close();
    }
}

