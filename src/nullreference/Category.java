package nullreference;

import java.util.Objects;

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
    private int categoryId;
    private String name;
    private boolean isDisabled;
    private  int order;
    private boolean isDeleted;
    private String createdAt;
    private String updated;

    public Category(){

    }

    public static int getLastCategoryId() {
        return lastCategoryId;
    }

    public static void setLastCategoryId(int lastCategoryId) {
        Category.lastCategoryId = lastCategoryId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDisabled() {
        return isDisabled;
    }

    public void setDisabled(boolean disabled) {
        isDisabled = disabled;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    /*
    public String getCreatedAt(){
    return createdAt;
     */
    public String getCreatedAt() {
        return Objects.requireNonNullElse(createdAt,"2024-02-29");
    }



    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }
}
