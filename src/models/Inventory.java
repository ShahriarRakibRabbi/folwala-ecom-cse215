package models;
public class Inventory {
    private int inventoryID;
    private int productID;
    private int quantity;

    public Inventory(int inventoryID, int productID, int quantity) {
        this.inventoryID = inventoryID;             
        this.productID = productID;
        this.quantity = quantity;
    }

    public int getInventoryID() {
        return inventoryID;
    }

    public int getProductID() {
        return productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setInventoryID(int inventoryID) {
        this.inventoryID = inventoryID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override

    public String toString() {
        return "Inventory{" +
                "inventoryID=" + inventoryID +
                ", productID=" + productID +
                ", quantity=" + quantity +
                '}';
    }

    
}
