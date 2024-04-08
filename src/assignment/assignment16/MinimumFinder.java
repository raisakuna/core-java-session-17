package assignment.assignment16;

public class MinimumFinder {
    // Function to find minimum of two integers, using Comparable Interface
    public static <T extends Comparable<T>> T min(T a, T b){
       if (a.compareTo(b) <0){
           return a;
        } else {
           return b;
        }
    }

    // Function to find minimum of two integers, using Comparable Interface and function overloading
    public static <T extends Comparable<T>> T min(T a, T b, T c){
       T minOfAB = min(a, b);  // First finding minimum of two and storing in another variable
       return min(minOfAB, c); // Finding minimum of stored variable and remaining value
    }

    public static void main(String[] args) {
        int a =10, b=90,c=23;
        System.out.println("Minimum of " +a + ", "+ b + " and " + c +  " is " + min(a,b,c));

        double d =55.4,e=54.34,f=54.3422;
        System.out.println("Minimum of " +d + ", "+ e + " and " + f +  " is " + min(d,e,f));
    }
}
