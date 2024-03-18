package primeNumber;

public class PrimeNumber2 {
    public static void main(String[] args) {


        System.out.println("Prime numbers between 1 and 100:");

        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            // Check if i is divisible by any number from 2 to i/2
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            // If i is not divisible by any number other than 1 and itself, it's prime
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}