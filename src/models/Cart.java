package models;

import java.util.ArrayList;

public class Cart {
    private int cartID;
    private double totalPrice;
    private String userPhone;
    private ArrayList<CartItem> products;
    private boolean isPurchased;
    private boolean isDeleted;

    public Cart(int cartID, int quantity, double totalPrice, String userPhone, ArrayList<CartItem> products,
            boolean isPurchased, boolean isDeleted) {
        this.cartID = cartID;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.userPhone = userPhone;
        this.products = products;
        this.isPurchased = isPurchased;
        this.isDeleted = isDeleted;
    }

    public int getCartID() {
        return cartID;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
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

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
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
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                ", userPhone='" + userPhone +
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

    public void emptyCart() {
        this.products.clear();
    }

    public static void addToCart(CartItem cartItem) {
        try {
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
    }

}
