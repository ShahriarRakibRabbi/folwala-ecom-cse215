package models;
public class Category {
    private String name;
    private int categoryID;

    public Category(String name, int categoryID) {
        this.name = name;
        this.categoryID = categoryID;
    }

    public String getName() {
        return name;
    }

    public int getCategoryID() {    
        return categoryID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    @Override 
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", categoryID=" + categoryID +
                '}';
    }
    
}
