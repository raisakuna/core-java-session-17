package abstractandinheritance.exampleone;

/**
 * With abstract keyword in class, we can't create an instance of an abstract class
 * They may have parameterized constructor which is called by its subclasses
 * An abstract class's purpose is to define the behavior its sublclasses are required to have.(inheritance)
 * Abstract method doesn't have body implementation, but abstract method must be inside abstract class
 */

public class OfficeApplication {

    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"John",3.5, "Java");
        Employee employee2 = new Employee(1,"John",3.5, "Java");

        System.out.println(employee1);
        System.out.println(employee2);

        Manager manager = new Manager(1,"Abc",343.22,445.3);

        System.out.println("Salary of employee " + employee2.getSalary());
        System.out.println("Salary of manager " + manager.getSalary());

       // System.out.println(String.format("%02s", String.valueOf(10)));

        System.out.println(employee2.toString());
        System.out.println(employee2.equals(employee1));


        System.out.println(String.format("%02d",String.valueOf(10)));


    }
}
