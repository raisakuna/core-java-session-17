package exception;

public class AssertionPractice {
    public static void main(String[] args) {
        int number = somePositiveInteger();
        if (number > 0) {
            //do something
        } else {
            throw new RuntimeException("The number is negative");
        }

    }
    public static int somePositiveInteger(){
        return 5;
    }
}
