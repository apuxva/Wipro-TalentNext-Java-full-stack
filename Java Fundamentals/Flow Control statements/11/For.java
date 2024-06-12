/*Write a program to print even numbers between 23 and 57. Each number should be printed in a
in separate row. */
public class For {
    public static void main(String[] args) {
        for (int i = 23; i>=23 && i<=57; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }

}