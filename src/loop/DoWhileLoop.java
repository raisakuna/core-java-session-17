package loop;

import java.util.Scanner;

/**
 * It always run once, whether the condition is satisfied or not.
 * do {
 *     statements;
 * }
 * while (condition)
 */
public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    String answer;
    do {
        System.out.println("The loop is executed");
        System.out.println("Do you want to exit? (Y/N) ");
        answer = sc.next();
    } while(answer.equals("N")) ;
        System.out.println("I am outside the loop");
    }
}
