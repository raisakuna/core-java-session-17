package assignment;

// Prime number is a number that has only two factors -1 and number itself.
// But 1 is not a prime number because it is not divisible by any other integer except for 1 itself
// Composite have more than two factors.

// Defining prime number algorithm
/*
2 = i (assume)
3 =  1 3
4 = 1 2   = 4/2
5 = 1 5
6 = 1 2 3  = 6/2
7 = 1 7
8 = 1 2 4 = 8/2
9 = 1 3
*/

public class Assignment11 {

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        for (int n = 1; n <= 100; n++) {
                if (isPrime(n)) {
                    System.out.print(n + " ");
                }
            }

        }
/*        System.out.println("Prime numbers between 1 and 100:");

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
        }*/

        /*// Best optimization Seive of Eratosthenes
        int n = 100; // Define the upper limit for prime numbers

        boolean[] isPrime = new boolean[n + 1];
        // Initialize all elements of isPrime[] to true
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Mark multiples of primes as non-prime
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Print prime numbers
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }}*/


}
