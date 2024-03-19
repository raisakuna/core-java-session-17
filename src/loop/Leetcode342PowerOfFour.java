package loop;

public class Leetcode342PowerOfFour {

    // Best Optimization
    public static boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) == 0 && (n & 0x55555555) != 0;
    }

    public static void main(String[] args) {
        int num1 = 16;
        int num2 = 15;

        System.out.println(num1 + " is a power of four: " + isPowerOfFour(num1)); // Output: true
        System.out.println(num2 + " is a power of four: " + isPowerOfFour(num2)); // Output: false
    }
   /* Brute Force Approach
    public static boolean isPowerOfFour(int n){
        if(n <=0){
            return false;
        }
        while(n % 4 ==0) {
            n= n/4;
        }
        return n == 1;
    }
    public static void main(String[] args) {
        int num1 =15;
        int num2 =16;
        System.out.println(num1 +" is a power of four: " + isPowerOfFour(num1));
        System.out.println(num2 +" is a power of four: " + isPowerOfFour(num2));

    }*/
}
