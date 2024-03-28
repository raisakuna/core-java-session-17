package abstractandinheritance.exampletwo;

/**
 * Abstract method are a method without a body implementation.
 * All the subclasses of an abstract class must implement those abstract method
 * Abstract methods can only be declared on an abstract class or interface
 */
public abstract class Animal {

    protected  String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void move(String speed);
    public abstract void makeNoise();

}
