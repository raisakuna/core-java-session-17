package bignumber;

import java.math.BigInteger;

public class BigNumberClass {
    public static void main(String[] args) {
        long largeNumber=1213123134334444313L;
        long largeNumber1 = 23532593204991349L;
        //double sum = Math.multiplyExact(largeNumber1,largeNumber);
       // System.out.println(sum);

        BigInteger bigInteger1 = new BigInteger("-3");
        BigInteger bigInteger2 = new BigInteger("02213123134334444313");

        BigInteger sumbig = bigInteger1.multiply(bigInteger2);
        System.out.println(sumbig);
        System.out.println(bigInteger2.signum());
        System.out.println(bigInteger1.signum());

    }
}
