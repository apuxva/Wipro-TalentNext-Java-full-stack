/*Write a program to count the number of times a character appears in a File. */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharacterCounter{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file path: ");
        String filePath= scanner.nextLine();
        System.out.println("Enter the character to count: ");
        char characterToCount= scanner.nextLine().toLowerCase().charAt(0);
        int count = 0;
        try( BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            int c;
            while((c= reader.read()) != -1) {
                if(Character.toLowerCase((char)c) == characterToCount){
                    count++;
                }
            }
        }catch(IOException e){
            System.out.println("Error reading the file: " + e.getMessage());
        }

        System.out.println("The character ' " + characterToCount + "' appears " + count + " times in the file.");
    }
}