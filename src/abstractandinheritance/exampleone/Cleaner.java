package abstractandinheritance.exampleone;

/**
 * Director class should not be inherited, How?
 * No other class can inherited Director
 *  use "final" keyword if you want permanently stop inheritance
 *
 */
public class Cleaner extends Director{
    public Cleaner(int id, String name, double salary, double bonus, int shares) {
        super(id, name, salary, bonus, shares);
    }
}
