package genericExample2;

import java.util.ArrayList;

public class GenericDemo {

    public static void main(String[] args) {
        ArrayList arrayList =  new ArrayList();


        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        int total =0;
        for(Object obj :arrayList){
         total += (Integer) obj;
        }
        System.out.println("Total: " + total);

    }
    public  class Test<T>{
        public void calculation(T a){
            System.out.println("Calculation = " + a.getClass());

        }
    }
}

