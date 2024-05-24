package models;
public class CartItem {

    private int cartItemID;
    private int product;
    private int quantity;

    public CartItem(int cartItemID, int product, int quantity) {
        this.cartItemID = cartItemID;
        this.product = product;
        this.quantity = quantity;
    }

    public int getCartItemID() {
        return cartItemID;
    }

    public int getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setCartItemID(int cartItemID) {
        this.cartItemID = cartItemID;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "cartItemID=" + cartItemID +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }

    
}
