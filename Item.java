// Manage variables using getter and setter methods, ensuring encapsulation and data integrity in the item class.


import java.util.*;

// Class: Item
class Item {
    private String itemId;
    private String itemName;
    private int quantity;
    private double price;

    // Constructor
    public Item(String itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and Setters
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toString method
    @Override
    public String toString() {
        return "Item ID: " + itemId + ", Name: " + itemName +
               ", Quantity: " + quantity + ", Price: $" + price;
    }
}

