package stringdetails;

import java.util.Arrays;

public class StringDetail {
    public static void main(String[] args) {
        String name ="Taman";
        String name1 =new String(("Taman"));

        String s = "GeeksForGeeks";
        char[] gfg = s.toCharArray();

        System.out.println(gfg);

        // Comparision here is doing on based on ASCII Value A=65, B=66
        String first ="A";
        String second ="B";
        String third ="C";
        int compareResult =first.compareTo(second);
        int compareResult1=first.compareTo(third);
        System.out.println("Compare result : " + compareResult);
        System.out.println(compareResult1);

        String policyNumber2 ="0023022H";
        String policyCode = policyNumber2.substring(0,2);
        System.out.println("Policy Code " + policyCode);

        System.out.println("======ASCII CODE compareTo");
        String firstValue ="Taman";
        String secondValue ="taman";
        int compareToResult = firstValue.compareTo(secondValue);

        System.out.println("====== String Split");



        String policyNumbers1 =  "06000001,A,50000;01000001,S,40000;02000005,Q,25000";
        String[] stripPolicy = policyNumbers1.split(";");

        System.out.println(Arrays.toString(stripPolicy));

        for(String innerStripPolicy :stripPolicy) {
            String[] policySplit = innerStripPolicy.split(",");


            // printing all
            for (String printPolicy : policySplit){
                System.out.print(printPolicy + " ");
            }
            System.out.println();
        }

        System.out.println("== toLower Case");
        String test ="Testing the String";
        String caseChanged =test.toUpperCase();
        System.out.println(caseChanged);
        System.out.println(test);

        // String concatenation
        System.out.println("======= String Concatenation");
        String firstname= "John";
        String lastName ="Doe";
         String fullname = firstname + " " + lastName;
        System.out.println(fullname);
        String fullName1 = firstname.concat(" ").concat(lastName);
        System.out.println(fullName1);

        // String Builder  append, reverse, repeat
        System.out.println("=== String Builder -Mutable Class ====");
        StringBuilder  builder  = new StringBuilder();
        builder.append(firstname);
        builder.append(" ");
        builder.append(lastName);

        String fullName2 =builder.toString();
        System.out.println(fullName2);

        builder.reverse();
        System.out.println(builder.toString());

        System.out.println();
        String word = "a".repeat(5);
        System.out.println(word + " ");

        String link = "register abc.com/kasdasd";
        String emailBody = String.format("Welcome %s, you are step behind getting registered. Please click on the link " +
                "below to verify your email \n %s,",fullname, link);

        System.out.println(emailBody);

        // Always remember whenever you get the email from UI, always strip because it may have spaces which database doesn't want

        System.out.println("=== Strip ====");
        String email = " abc@gmail.com  ";
        String emailStrip = email.strip();

        System.out.println();

        String empty =  "";
        String emptyWithWhiteSpaces="  ";
        System.out.println("Empty without spaces " + empty.isEmpty());
        System.out.println("Empty with white spaces " + emptyWithWhiteSpaces.isEmpty());
        System.out.println("For removing white spaces use trim().");
        System.out.println("Empty with white spaces " + emptyWithWhiteSpaces.trim().isEmpty());

    }
}
