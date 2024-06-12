/*7. Write a program to remove the duplicate elements in an array and print the same. */

public class Duplicate {
    static int rDuplicate(int[]ar) {
        int rd=0;
        for (int i = 1; i < ar.length; i++) {
            if(ar[rd] !=ar[i]){
                rd++;
                ar[rd]=ar[i];
            }
        }
        return rd+1;
    }
    public static void main(String[] args) {
        int ar [] = {11,11,22,33,55,55,66};
        for (int i = 0; i < ar.length; i++) {     
            System.out.print(ar[i] + " ");    
        } 
        int rd = rDuplicate(ar);
        System.out.println();

        for (int i = 0; i < rd; i++) {     
            System.out.print(ar[i] + " ");    
        }
    }
}

