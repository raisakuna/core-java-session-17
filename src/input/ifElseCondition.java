package input;

import java.util.Scanner;

/**
 * If {}
 * else if{}
 * else{}
 * is used for conditional statement, we can also use only "if"  condition but differences is that with "if else",
 * if condition meets on first condition then it will ignore other lines of code. One more thing if  and if else condition
 * is used only if we have different value or condition to check here we are checking "day" variable with "equals" method
 * so IDE will suggest us to use "switch" case statement.
 * That's why I have commented out if condition
 * and more advantage of switch case condition is that it is litter faster than if else condition
 * switch case check only we have only one condition to check and equals condition, it won't check for less than or greate than
 */
public class ifElseCondition {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Which day special dishes?");

        String day = sc.nextLine();

       /* if(day.equals("Sunday")){
            System.out.println("today's special dish is momo");
        }
       else if(day.equals("Monday")){
            System.out.println("today's special dish is Chowmein");
        }
        else if(day.equals("Tuesday")){
            System.out.println("today's special dish is Chowmein");
        }
        else if(day.equals("Wednesday")){
            System.out.println("today's special dish is Chowmein");
        }
        else if(day.equals("Thursday")){
            System.out.println("today's special dish is Chowmein");
        }
        else if(day.equals("Friday")){
            System.out.println("today's special dish is Chowmein");
        }
        else if(day.equals("Saturday")){
            System.out.println("today's special dish is Chowmein");
        }
        else{
            System.out.println("Invalid input");
        }
*/
        // Java 17 Enhanced switch
        switch (day.toLowerCase()) {
            case "sunday", "thursday" -> System.out.println("today's special dish is momo");
            case "monday" -> System.out.println("today's special dish is Chowmein");
            case "tuesday" -> System.out.println("today's special dish is chicken");
            case "wednesday" -> System.out.println("today's special dish is puri");
           // case "Thursday" -> System.out.println("today's special dish is momo");
            case "friday" -> System.out.println("today's special dish is dumpling");
            case "saturday" -> System.out.println("today's special dish is sandwich");
            default -> System.out.println("Invalid input");
        }

        /*switch (day) {
            case "Sunday" :
                System.out.println("today's special dish is momo");
                break;
            case "Monday" :
                System.out.println("today's special dish is Chowmein");
                break;
            case "Tuesday":
                System.out.println("today's special dish is chicken");
                break;
            case "Wednesday":
            case "Thursday":
                System.out.println("today's special dish is puri");
                break;
           *//* case "Thursday":
                System.out.println("today's special dish is puri");
                break;*//*
            case "Friday" :
                System.out.println("today's special dish is dumpling");
                break;
            case "Saturday" :
                System.out.println("today's special dish is sandwich");
            default :
                System.out.println("Invalid input");
        }*/


    }
}
