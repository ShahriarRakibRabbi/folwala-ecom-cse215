package models;

public class OrderItem {

  private int orderItemID;
  private int orderID;
  private Product product;
  private int quantity;
  private double price;

  public OrderItem(int orderItemID, int orderID, Product product, int quantity, double price) {
    this.orderItemID = orderItemID;
    this.orderID = orderID;
    this.product = product;
    this.quantity = quantity;
    this.price = price;
  }

  public int calculateItemTotal() {
    return quantity * product.getPrice();
  }

}
