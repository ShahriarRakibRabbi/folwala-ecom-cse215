package model;
public class Product {
    private String name;
    private double price;
    private int productID;
    private int stockQuantity;
    private String category;
    private boolean isAvailable;
    private boolean isDeleted;


    public Product(String name, double price, int productID, int stockQuantity, String category, boolean isAvailable, boolean isDeleted) {
        this.name = name;
        this.price = price;
        this.productID = productID;
        this.stockQuantity = stockQuantity;
        this.category = category;
        this.isAvailable = isAvailable;
        this.isDeleted = isDeleted;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getProductID() {
        return productID;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public String getCategory() {
        return category;
    }

    public boolean isAvailable() {
        return isAvailable;
    }


    public boolean isDeleted() {
        return isDeleted;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", productID=" + productID +
                ", stockQuantity=" + stockQuantity +
                ", category='" + category + '\'' +
                ", isAvailable=" + isAvailable +
                ", isDeleted=" + isDeleted +
                '}';
    }

    public void updateStock(int quantity) {
        this.stockQuantity += quantity;
    }

}
