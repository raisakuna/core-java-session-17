package abstractandinheritance.exampleone;

import java.util.Objects;

public class Employee extends Person{

    private String department;

    @Override
    public String toString() {
        return "Employee{" +
                "id='" +super.getId() + '\''+
                "name='" +super.getName() + '\''+
                "salary='" +super.getSalary() + '\''+

                "department='" + department + '\'' +
                '}';
    }

    // Constructor calling inside constructor
    public Employee(int id, String name, double salary, String department){
        super(id,name,salary);  // Calling parent constructor
        this.department =department;
        System.out.println("calling from employee");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return super.getId() == employee.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getId());
    }

    @Override
    public void description() {

    }
}
