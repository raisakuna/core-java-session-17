package assignment;

public class DivisionCalculator {
    public static void main(String[] args) {


        float computer = 85;
        float science = 90;
        float maths = 34;
        float english = 45;
        float account = 34;

        float total = (computer + science + maths + english + science);
        float percentage = (total * 100) / 500;
        System.out.println(percentage);

        boolean isFailed = computer < 32 || science < 32 || maths < 32 || english < 32 || account < 32;

        if (percentage >= 80) {
            System.out.println("Distinction");
        } else if (percentage >= 70 && percentage < 80) {
            System.out.println("FirstDivision");
        } else if (percentage >= 60 && percentage < 70) {
            System.out.println("Second Division");
        } else if (percentage >= 40 && percentage < 60) {
            System.out.println("Third Division");
        } else {
            System.out.println("Failed");
        }
    }
}