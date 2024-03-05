package staticpractice;

/** Static keyword
 * mainly used for memory management
 *
 * # With class, cannot declare a top-level call a static but can declare nested class as static. Static class cannot
 * access non-static member of the outer class.
 *
 * # Block: gets executed once when the class is first loaded.
 * class Test {
 *     static int a = 10;
 *     static int b;
 *
 *     static {
 *         System.out.println("Static block initialized.");
 *         b = a * 4;
 *     }
 *
 * # Variables: shared among all instances of the class, like a global variables and is available to all methods
 * it is created only at the class level, not inside a method.
 * Accessed using class name and can be accessed from any part of the program
 *
 * #method => Most common use of static methods is to access static variables.
 *  Accessed by class name and dot (.) followed by the name of a method
 *  often utility methods
 *  In normal function "this" keyword is used but in static function "this" keyword doesn't used
 *  mean, static function doesn't have implicit parameter (this=> object itself)
 *
 *  Static used a memory for a long period of time.
 *  If you look carefully in most IDE, static functions are italic.
 */
public class Door {

    private static int count;
    private String name;

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public Door(String name) {
        this.name = name;
    }

    // For d1.personEntered(); "this" value will be d1 when the field is private int count
    // For d2.personEntered(); "this" value will be d2 when the field is private int count and so on

    public void personEntered(){
        this.count = count +1;
    }

    public void personExited(){
        this.count = count -1;
    }
}
