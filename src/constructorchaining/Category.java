package constructorchaining;

/** ## Constructor chaining ##
 * Constructor chaining is the process of calling one constructor from another constructor with respect to current object.
 * One of the main use of constructor chaining is to avoid duplicate codes while having multiple constructor (by means of constructor overloading) and make code more readable.
 * The this() expression should always be the first line of the constructor.
*/

public class Category {
    private int id;
    private String name;
    private boolean isDisabled;
    private  int order;
    private boolean isDeleted;
    private String createdAt;
    private String updated;

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isDisabled=" + isDisabled +
                ", order=" + order +
                ", isDeleted=" + isDeleted +
                ", createdAt='" + createdAt + '\'' +
                ", updated='" + updated + '\'' +
                '}';
    }

    public Category(int id, String name, boolean isDisabled, int order, boolean isDeleted) {
        this.id = id;
        this.name = name;
        this.isDisabled = isDisabled;
        this.order = order;
        this.isDeleted = isDeleted;
    }

    public Category(int id, String name, boolean isDisabled, int order, boolean isDeleted, String createdAt, String updated) {
        this(id, name,isDisabled,order,isDeleted);
        this.createdAt = createdAt;
        this.updated = updated;
    }

    public static void main(String[] args) {
        Category politics =new Category(1,"Politics",false,2,false, "2024-3-4","2024-3-5");
        System.out.println(politics);
    }
}
