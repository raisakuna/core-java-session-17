package assignment;

import java.util.Arrays;

public class PolicySplit {
    public static void main(String[] args) {
        String policyNumbers1 =  "06000001,A,50000;01000001,S,40000;02000005,Q,25000";
        String[] stripPolicy = policyNumbers1.split(";");

        System.out.println(Arrays.toString(stripPolicy));

        for(String innerStripPolicy :stripPolicy) {
            String[] policySplit = innerStripPolicy.split(",");


            // printing all
            for (String printPolicy : policySplit){
                System.out.print(printPolicy + " \t");
            }
            System.out.println();
        }
    }

}
