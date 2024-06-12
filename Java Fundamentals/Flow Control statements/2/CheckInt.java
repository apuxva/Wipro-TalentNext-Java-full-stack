/*Write a program to check if a given integer number is odd or */
public class CheckInt {
    public static void main (String args[]){
        int x = Integer.parseInt(args[0]); 
        if(x%2 == 0){
            System.out.println("The Integer is Even");
        }
        if (x==0){
            System.out.println("The integer is Zero");
        }
        else {
            System.out.println("The Integer is Odd");
        }
    }
}
