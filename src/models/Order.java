package models;

import java.util.ArrayList;

public class Order {

  private int orderID;
  private int userID;
  private String orderDate;
  private ArrayList<OrderItem> orderItems;
  private double orderAmount;
  private String orderStatus;

  public Order(int orderID, int userID, String orderDate, ArrayList<OrderItem> orderItems, double orderAmount,
      String orderStatus) {
    this.orderID = orderID;
    this.userID = userID;
    this.orderDate = orderDate;
    this.orderItems = orderItems;
    this.orderAmount = orderAmount;
    this.orderStatus = orderStatus;
  }

  public int getOrderID() {
    return orderID;
  }

  public int getUserID() {
    return userID;
  }

  public String getOrderDate() {
    return orderDate;
  }

  public ArrayList<OrderItem> getOrderItems() {
    return orderItems;
  }

  public double getOrderAmount() {
    return orderAmount;
  }

  public String getOrderStatus() {
    return orderStatus;
  }

  public void placeOrder() {
    this.orderStatus = "Placed";
  }

  public void cancelOrder() {
    this.orderStatus = "Cancelled";
  }

  public void deliverOrder() {
    this.orderStatus = "Delivered";
  }

  public void shipOrder() {
    this.orderStatus = "Shipped";
  }

  public void updateOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }

}
