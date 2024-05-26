package controllers;

import models.Cart;
import models.CartItem;
import utils.InputHandler;

public class CartController {

  public static void addToCart() {
    String productID = InputHandler.readString("Enter Product ID: ");
    int quantity = InputHandler.readInt("Enter Quantity: ");

    CartItem cartItem = new CartItem(Integer.parseInt(productID), quantity);
    Cart.addToCart(cartItem);
  }

}
