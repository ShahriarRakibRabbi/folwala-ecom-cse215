package models;

public class Payment {

  int paymentID;
  int orderID;
  String paymentDate;
  double paymentAmount;
  String paymentStatus;

  public Payment(int paymentID, int orderID, String paymentDate, double paymentAmount, String paymentStatus) {
    this.paymentID = paymentID;
    this.orderID = orderID;
    this.paymentDate = paymentDate;
    this.paymentAmount = paymentAmount;
    this.paymentStatus = paymentStatus;
  }

  public int getPaymentID() {
    return paymentID;
  }

  public int getOrderID() {
    return orderID;
  }

  public void processPayment() {
    this.paymentStatus = "Processed";
  }

}
