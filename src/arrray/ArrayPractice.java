package arrray;

import java.util.Arrays;

public class ArrayPractice {


    // Driver code
    public static void main(String args[]) {
        String[] names=new String[3];
        names[0] ="Ram";
        names[1] = "Shyam";
        names[2] ="Tamang";

        System.out.println(Arrays.toString(names));

        // Print the values of the array
        for (String name : names) {
            System.out.print(name + " ");
        }

        System.out.println();
      names=  Arrays.copyOf(names,4);
        System.out.println(Arrays.toString(names));

    }
}
