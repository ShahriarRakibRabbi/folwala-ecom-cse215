package models;

public class CartItem {
    private int product;
    private int quantity;

    public CartItem(int product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public int getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
