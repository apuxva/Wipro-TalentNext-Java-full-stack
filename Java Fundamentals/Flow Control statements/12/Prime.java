//Write a program to check if a given number is prime or not.
public class Prime {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        if (x <= 1) {
            System.out.println("Not a prime number.");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("It is a prime number.");
        } else {
            System.out.println("It is not a prime number.");
        }
    }
}
