package predefinedclass;

import java.util.ArrayList;
import java.util.List;

public class MathRandom {



    public static void main(String[] args) {
        // Math.random() returns random double number between 0.0 to 1.0
        System.out.println(Math.random());

        // Generate a random int number
        int randomNumber = (int) (Math.random() * Integer.MAX_VALUE);
        System.out.println("Random number: " + randomNumber);

        // Generate a random number between 1 and 10
        int max=10;
        int min =1;
        int randomNumberRange =  (int)(Math.random() * (max - min +1) +min);
        System.out.println("Random number between 1 and 10: " +randomNumberRange);

        // List of 5 Random number between 1 and 10
        int numberOfRandomNumber =5;
        List<Integer> randomNumberList =  new ArrayList<>();
        for (int i =0; i < numberOfRandomNumber; i++){
           int randomNumbers = (int)(Math.random()*(max-min + 1) + min);
            randomNumberList.add(randomNumbers);
        }
        // System.out.println(randomNumberList);

        for(int rndNumber: randomNumberList){
            System.out.print(rndNumber + " ");
        }


    }

}
