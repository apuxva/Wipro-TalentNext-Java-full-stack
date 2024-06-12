/*Write a Program to accept two integers as command line arguments 
and print the sum of the two numbers */
public class SumInt {
    public static void main (String [] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z =  x + y;
        System.out.println("The sum of two integers is " + z);

    }
}