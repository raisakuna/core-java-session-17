package input;

import java.util.Scanner;

public class ResultApplication {
    public static void main(String[] args) {
        float maths, science, computer, english, health;

        float percentage, total;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter marks for math: ");
        maths =sc.nextFloat();

        System.out.print("Please enter marks for science: ");
        science =sc.nextFloat();

        System.out.print("Please enter marks for computer: ");
        computer =sc.nextFloat();

        System.out.print("Please enter marks for english: ");
        english =sc.nextFloat();

        System.out.print("Please enter marks for health: ");
        health =sc.nextFloat();

        System.out.println("marks for math " + maths);
        System.out.println("marks for math " + science);
        System.out.println("marks for math " + computer);
        System.out.println("marks for math " + english);
        System.out.println("marks for math " + health);

        total = maths + computer + science + english + health;
        percentage =  (total/500) * 100;

        System.out.println("Your total is  " +  total);
        System.out.println("Percentage  is " +  percentage);

        String message = String.format("The percentage obtained is %.2f",percentage);
        System.out.println(message);

    }
}
