package controlflow;

public class BlockScope {
    // scope of "a" as it is created inside the class, it has scope within the class including main method
    // scope of "b" is within the main method. It is also called local variable as it is inside the function
    // the main purpose of { .. } curly braces is to define the scope of a variable.

    static int a  =5;

    public static void main(String[] args) {
        System.out.println(a);
         int b = 10;
    }
    void someFunction(){
        System.out.println(a);

    }
}
