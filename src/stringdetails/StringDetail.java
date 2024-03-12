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

        String policyNumbers1 =  "06000001,A,50000;01000001,S,40000;02000005,Q,25000";
        String[] stripPolicy = policyNumbers1.split(";");

        System.out.println(Arrays.toString(stripPolicy));

        for(String innerStripPolicy :stripPolicy) {
            String[] policySplit = innerStripPolicy.split(",");


            // printing all
            for (String printPolicy : policySplit){
                System.out.println(printPolicy + " ");
            }
            System.out.println();
        }
    }
}
