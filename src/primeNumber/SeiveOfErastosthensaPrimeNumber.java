package primeNumber;

// O(log(n))
public class SeiveOfErastosthensaPrimeNumber {
    public static void main(String[] args) {
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
            }
        }
    }
}