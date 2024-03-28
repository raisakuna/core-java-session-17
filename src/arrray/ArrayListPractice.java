package arrray;

/**
 * Java class implements List Interface
 * dynamic array of default size 10
 * allow duplicate value
 * follow insertion order
 */

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("ABC");
        names.add("ABC");
        names.add("ABC");
        names.add("ABC");
        System.out.println(names);

        // Using the for each loop
        for (String str : names)
            System.out.print(str + " ");

        names.add(2,"XYZ");
        for(String newValue : names){
            System.out.print(newValue + " ");
        }

        System.out.println("\n=====================");
        ArrayList<String> withHeldNames = new ArrayList<>();
        withHeldNames.add("John");
        withHeldNames.add("Doe");

        names.addAll(withHeldNames);
        System.out.println(names);

        System.out.println("\n==== Updating Data with set(int index, new value)==========");
        names.set(1,"Changed value");
        System.out.println(names);

        System.out.println("\n remove () either by index, value");
        names.remove(3);
        System.out.println(names);

        System.out.println("\n removing data by value itself");
        names.remove("ABC");
        System.out.println(names);

        System.out.println("remove() works fine with String object but for custom object it won't work");
        ArrayList<Student>students = new ArrayList<>();
        students.add(new Student("ABC",1));
        students.add(new Student("DEF",2));
        students.add(new Student("GHI",3));

        System.out.println(students);
        for(Student stu : students){
            System.out.println(stu);
        }

        int sizeOfStudent = students.size();
        System.out.println(sizeOfStudent);


        System.out.println("===sorting names =====");
        Collections.sort(names);
        System.out.println(names);


        Collections.reverse(students);
        System.out.println(students);

       /* students.clear();
        names.clear();
        System.out.println(students);
        System.out.println(names);
*/
    }


}
