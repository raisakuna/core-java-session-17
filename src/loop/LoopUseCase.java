package loop;

import java.util.stream.IntStream;

public class LoopUseCase {
    public static void main(String[] args) {

    // for loop is deterministic loop mean you know how many times you have to run loop, here in our case is 10
    for(int i = 0; i <10; i++) {
        if (i%2 == 0) {
            System.out.print(i + " ");
        }
        System.out.print(i + " ");
    }

        System.out.println("\nxxxxxxxxxxxxxxxxx");
       int[] num =  IntStream.range(0,10).toArray();
        for(int intStreamnum : num){
            System.out.print(intStreamnum + " ");
        }
        System.out.println("\n============");
    // IntStream Class
        IntStream.range(0,10)
                .filter(i -> i%2==0)
                .forEach(i -> System.out.print(i + " "));

        // enhanced loop
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int number :numbers){
            if(number %2 != 0){
                System.out.print(number+ " ");
            }


    }




    }

}
