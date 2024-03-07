package himalayantimes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * This class is used to create the Category object that is required by Post
 * @author  Rai, Sakuna
 * Date: 03-07-2024
 */
public class Category {
    /*  id - int
        name - String
        isDisabled - boolean
        order-int
        isDeleted -  boolean
        createdAt - String
        updatedAt -String
     */
    private static  int lastCategoryId =-1;
    private int id;
    private String name;
    private boolean isDisabled;
    private  int order;
    private boolean isDeleted;
    private String createdAt;
    private String updated;

    @Override
    public String toString() {
        return String.format(" %-5s  %-20s  %-10s  %-5s  %-10s  %-10s  %-10s ",
                id, name, isDisabled, order, isDeleted, createdAt, updated);
    }

    /**
     *  This is a parameterized Constructor.
     * @param name This Category name should be String and should not be null
     * @param isDisabled
     * @param order This Category order is always positive number
     * @param isDeleted
     */
    public Category(String name, boolean isDisabled, int order, boolean isDeleted) {
        this.id = ++lastCategoryId;
        this.name = name;
        this.isDisabled = isDisabled;
        this.order = order;
        this.isDeleted = isDeleted;
        this.createdAt = LocalDate.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        this.updated = LocalDate.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
    }
}
