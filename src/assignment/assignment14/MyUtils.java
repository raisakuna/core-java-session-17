package assignment.assignment14;

import java.util.ArrayList;

public class MyUtils {

    public static <T> void iterateList(ArrayList<T> list) {
        for (T temp : list) {
            System.out.println(temp);
        }
    }
}