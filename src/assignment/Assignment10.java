package assignment;

public class Assignment10 {
    public static String generateOddString(int n) {
        if (n % 2 == 0) {
            n += 1; // Ensure the string length is odd
        }
        StringBuilder oddString = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++) {
            for (int i = 0; i < n / 26; i++) {
                oddString.append(c); // Add each letter n/26 times
            }
        }
        for (int i = 0; i < n % 26; i++) {
            oddString.append('a'); // Add the remaining characters if n%26 is not 0
        }
        return oddString.substring(0, n); // Trim the string to length n
    }

    public static void main(String[] args) {
        int n = 9; // Length of the odd string
        System.out.println(generateOddString(n));
    }

}
