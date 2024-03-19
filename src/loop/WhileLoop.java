package loop;

import java.util.Scanner;

/** It checks the condition first, then only execute the statements. Where as in do-while, it always runs at least
 * statement once. It is an entry controlled loop.
 * while(condition){
 *     statements
 *     break; Use to stop the loop, even if the condition is satisfied
 * }
 */
public class WhileLoop {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to exit? (Y/N) ");
        String answer = sc.next();
        while(answer.equals("N")){
            System.out.println("The loop is executed");
            System.out.println("Do you want to exit? (Y/N");
             answer = sc.next();
        }
        System.out.println("I am outside the loop");
    }
}
