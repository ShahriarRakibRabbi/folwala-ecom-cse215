package models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Product {
    private String name;
    private double price;
    private int productID;
    private int stockQuantity;
    private String category;
    private String unit;
    private boolean isAvailable;
    private boolean isDeleted;

    public Product(String name, double price, int productID, int stockQuantity, String category, String unit,
            boolean isAvailable,
            boolean isDeleted) {
        this.name = name;
        this.price = price;
        this.productID = productID;
        this.stockQuantity = stockQuantity;
        this.category = category;
        this.unit = unit;
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

    public String getUnit() {
        return unit;
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
        return "Product :" +
                "name" + name + '\'' +
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

    public static ArrayList<Product> getProductsByCategory(String category) {
        String filePath = "data/products.txt";
        ArrayList<Product> products = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(" ");
                if (data[4].equals(category)) {
                    Product product = new Product(data[0], Double.parseDouble(data[1]), Integer.parseInt(data[2]),
                            Integer.parseInt(data[3]), data[4], data[5], Boolean.parseBoolean(data[6]),
                            Boolean.parseBoolean(data[7]));
                    products.add(product);
                }
            }
            bufferedReader.close();
            return products;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}
