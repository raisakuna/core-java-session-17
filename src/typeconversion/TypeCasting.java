package typeconversion;

public class TypeCasting {
    public static void main(String[] args) {


        float r =1f/2;
        System.out.println(r);

        System.out.println(3.0 + "1");
        System.out.println(2.0 + " " + 3.0);
        System.out.println(2.0 + 3.0 + "");
        System.out.println(""+2.0 + 3.0 ); // Always left to right, String has higher precedence

        int m =7;
        int n =7;



        int result1 = ++m * 2;
        int result2 = n++ * 2;

        System.out.println(m);
        System.out.println(n);

        System.out.println(result1);
        System.out.println(result2);

        float computer =85;
        float science = 90;
        float maths = 34;
        float english =45;
        float account = 34;

        float total = (computer + science + maths + english + science);
        float percentage = (total*100)/500;
        System.out.println(percentage);

        boolean isFailed = computer <32 || science <32 || maths <32 || english < 32 || account <32;

        if (percentage >=80){
            System.out.println("Distinction");
        }
        else  if (percentage >=70 && percentage <80){
            System.out.println("FirstDivision");
        }
        else if(percentage >= 60 && percentage < 70){
            System.out.println("Second Division");
        }
        else if(percentage >=40 && percentage <60){
            System.out.println("Third Division");
        }
        else {
            System.out.println("Failed");
        }
    }


}
