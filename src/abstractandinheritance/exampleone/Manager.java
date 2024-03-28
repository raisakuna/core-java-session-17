package abstractandinheritance.exampleone;

public class Manager extends Person{
    private double bonus;

    /*public Manager(){
        System.out.println("Constructor  of Manager");
    }*/

    public Manager(int id, String name, double salary, double bonus){
        super(id, name, salary);  // Calling parent Constructor
        this.bonus =bonus;
        System.out.println();
    }

    // Overloading concept here we are overriding getSalary() method that we have in Person Class
    // because manager's salary is 1000 +200(bonus) so we use super.getSalary() + this.bonus
    // bonus is not available in Person class.
    @Override
    public double getSalary(){
        return super.getSalary() + this.bonus;
    }

    @Override
    public void description() {

    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +

                "bonus=" + bonus +
                '}';
    }
}
