//Write a program to print prime numbers between 10 and 99.
public class Primes {
    public static void main(String[] args) {
        for (int i = 10; i <= 99; i++) {
            boolean isPrime = true;
            
            if (i <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
