package interfaceindetails_Comparator;

/**
 * Normally parent class's object is not created
 * with abstract keyword, we cannot create an instance of a class
 * we can restrict the creation of object by making constructor private but the problem is it's child cannot
 * inherited the parent class
 * Internally constructor of Parent class can be called, but it shows an error if we call from outside(main)
 *
 *
 */
public abstract class Person {
    private int id;
    private String name;
    private double salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
    /* public Person(){
        System.out.println("constructor of person");
    }*/
    // Constructor
    public Person(int id, String name, double salary){
        System.out.println("Parameterized constructor called");
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /** abstract function().
     * this abstract function will be enforced into child classes
      */


    public abstract void description();
}
