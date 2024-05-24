package models;
import java.util.ArrayList;

public class Cart {
    private int cartID;
    private int productID;
    private int quantity;
    private double totalPrice;
    private int userID;
    private ArrayList<CartItem> products;
    private boolean isPurchased;
    private boolean isDeleted;

    public Cart(int cartID, int productID, int quantity, double totalPrice, int userID, ArrayList<CartItem> products, boolean isPurchased, boolean isDeleted) {
        this.cartID = cartID;
        this.productID = productID;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.userID = userID;
        this.products = products;
        this.isPurchased = isPurchased;
        this.isDeleted = isDeleted;
    }

    public int getCartID() {
        return cartID;
    }

    public int getProductID() {
        return productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getUserID() {
        return userID;
    }

    public ArrayList<CartItem> getProducts() {
        return products;
    }

    public boolean isPurchased() {
        return isPurchased;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setProducts(ArrayList<CartItem> products) {
        this.products = products;
    }

    public void setPurchased(boolean purchased) {
        isPurchased = purchased;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Override

    public String toString() {
        return "Cart{" +
                "cartID=" + cartID +
                ", productID=" + productID +
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                ", userID=" + userID +
                ", products=" + products +
                ", isPurchased=" + isPurchased +
                ", isDeleted=" + isDeleted +
                '}';
    }

    
    public void updateTotalPrice(double price) {
        this.totalPrice += price;
    }

    public void updateProducts(CartItem product) {
        this.products.add(product);
    }

    public void removeProduct(CartItem product) {
        this.products.remove(product);
    }

    public void purchaseCart() {
        this.isPurchased = true;
    }

    public void deleteCart() {
        this.isDeleted = true;
    }

    public void restoreCart() {
        this.isDeleted = false;
    }

    public void emptyCart() {
        this.products.clear();
    }

}
