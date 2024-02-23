package polymorphism;

public class CalculatorApplication {
    public static void main(String[] args) {
        int a, b;
        add(5,10);

        a=5; b=32;
        multiply(a,b);

        float c,d;
        c=5.456f; d =3.4377f;
        add(c,d);
        multiply(c,d);

        double e,f;
        e=4.332; f =523.23;
        add(e,f);
        multiply(e,f);



    }
    public static void add(int a , int b){
       int  sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is "+ sum);

    }
    public static void multiply(int a, int b){
        int sum =a * b ;
        System.out.println("Multiplication of " + a + " and "+ b +" is " +sum);
    }

    // Float Addition and Multiplication
    public static void add(float a , float b){
        float  sum = a + b;
        System.out.println(String.format("Sum of %.2f and %.2f is %.2f",a,b, sum));


    }
    public static void multiply(float a, float b){
        float sum =a * b ;
        System.out.println(String.format("Multiplication of %.2f and %.2f is %.2f",a,b, sum));    }

    // Float Addition and Multiplication
    public static void add(double a , double b){
        double  sum = a + b;
        System.out.println(String.format("Sum of %.2f and %.2f is %.2f",a,b, sum));


    }
    public static void multiply(double a, double b){
        double sum =a * b ;
        System.out.println(String.format("Multiplication of %.2f and %.2f is %.2f",a,b, sum));    }

}
