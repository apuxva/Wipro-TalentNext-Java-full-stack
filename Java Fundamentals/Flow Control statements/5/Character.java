/*Initialize a character variable in a program and
print 'Alphabhet' if the initialized value is an alphabhet,
print 'Digit' if the initialized value is a number, and
print 'Special Character', if the initialized value is anything else. */
import java.util.*;
class Character
 {
   public static void main(String[] args){   
        char ch;
       try (Scanner s = new Scanner(System.in)) {
           System.out.println("Input a character: ");
           ch = s.next().charAt(0);
           
           if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
           {
               System.out.println("This is an alphabet.");
           }
           else if(ch>='0' && ch<='9')
           {
               System.out.println("This is a digit.");
           }
           else
           {
               System.out.println("This is a special character.");
           }
       }
}
}