package predefinedclass;

import java.util.Random;

public class MathClassAssignment {
    // abs, floor, ceil, round, max, min,  signum, sqrt,random

    public static void main(String[] args) {
        // abs
       int a= Math.abs(-2);
       double b=  Math.abs(-232.333);
       float c =  Math.abs(-56.343f);
       long d = Math.abs(-3433433);
        System.out.println("int a = " + a +
                "\n double b = " +b +
                "\n float c = " + c +
                "\n long d = " + d
        );

        // floor returns double
        double doubleNumber =  43.3;
        double x= -32.2;
        System.out.println("Math.floor(" + doubleNumber + ") is " + Math.floor(doubleNumber));
        System.out.println("Math.floor(" + x + ") is " + Math.floor(x));

        // ceil
        double num1 = 34.44;
        double num2 = -34.33;
        System.out.println("Math.ceil(" + num1 + ") is " + Math.floor(num1));
        System.out.println("Math.ceil(" + num2 + ") is " + Math.floor(num2));

        // round
        double num3 = 33.98;
        double num4 = 33.4999;
        System.out.println("Math.round(" + num3 + ") is " + Math.round(num3));
        System.out.println("Math.round(" + num4 + ") is " + Math.round(num4));

        // max - int, double
        int maxInt1 =1;
        int maxInt2 = 9;
        int maxInt =  Math.max(maxInt1,maxInt2);
        System.out.println("Math.max("+maxInt1 +", " +maxInt2 +") = " + maxInt);

        double maxDouble1= 94.33;
        double maxDouble2 = 32.2;
        double maxDouble = Math.max(maxDouble2,maxDouble1);
        System.out.println("Math.max("+maxDouble2 +", " +maxDouble1 +") = " + maxDouble);

        // min - int, double
        int minInt1 =2;
        int minInt2 = 9;
        int minInt =  Math.min(minInt1,minInt2);
        System.out.println("Math.min("+minInt1 +", " +minInt2 +") = " + minInt);

        double minDouble1= 94.33;
        double minDouble2 = 32.2;
        double minDouble = Math.min(minDouble2,minDouble1);
        System.out.println("Math.min("+minDouble2 +", " +minDouble1 +") = " + minDouble);

        // signum: checks whether a number is positive,zero or NaN. Returns double.
        System.out.println(Math.signum(8.75));
        System.out.println(Math.signum(-3.5));
        System.out.println(Math.signum(0));
        System.out.println(Math.signum(Double.NaN));

        //sqrt
        int sqrtNumber = 25;
        System.out.println("Math.sqrt("  +sqrtNumber + ") = " + Math.sqrt(sqrtNumber));

    }

}
