package interfaceindetails_Comparator;



import genericExample.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class InterfaceObjectCreation {
    public static void main(String[] args) {
        ClickListener clickListener = new ClickListenerImpl();  // child class storing in Parent class-> Inheritance


        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("XYZ", 2));
        students.add(new Student("XYZ", 2));
        students.add(new Student("XYZ", 2));
        students.add(new Student("XYZ", 2));

      //  Comparator<Student> comparator = new RollNumberBasedComparator();

     //   Collections.sort(students, comparator);

        // Lambda Expression means passing the code without creating a class
        // With this we don't have to create a class externally or inner class
        // Before Java 8, we have to create a class externally that implements Comparator
        // or inner class
        Comparator<Student> comparator1 = (o1, o2) -> {
            return Integer.compare(o1.getRollNumber(), o2.getRollNumber());
        };
        Collections.sort(students, comparator1);


        Comparator<Student> comparator2 = Comparator.comparingInt(Student::getRollNumber);
        Collections.sort(students,comparator2);

    }

    // inner class to create an object of interface
       /* public static class RollNumberBasedComparator implements Comparator<Student> {

            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getRollNumber(), o2.getRollNumber());
            }


        }*/

}
