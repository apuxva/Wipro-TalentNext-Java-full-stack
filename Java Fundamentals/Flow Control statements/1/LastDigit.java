/*Given two non-negative int values, 
print true if they have the same last digit, such as with 27 and 57. */
public class LastDigit {
    public static void main (String args[]){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        if (x%10 == y%10){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
