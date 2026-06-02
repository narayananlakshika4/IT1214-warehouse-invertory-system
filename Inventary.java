//Manage the inventory of items in the warehouse, allowing user to add, remove, upadte, search and display items in the inventory.

class Inventory {
    private HashMap<String, Item> items;

    public Inventory() {
        items = new HashMap<>();
    }

    // Add a new item
    public void addItem(Item item) {
        if (items.containsKey(item.getItemId())) {
            System.out.println("Item with this ID already exists!");
        } else {
            items.put(item.getItemId(), item);
            System.out.println("Item added successfully.");
        }
    }

    // Remove an item
    public void removeItem(String itemId) {
        if (items.remove(itemId) != null) {
            System.out.println("Item removed successfully.");
        } else {
            System.out.println("Item not found!");
        }
    }

    // Update item quantity
    public void updateQuantity(String itemId, int newQuantity) {
        Item item = items.get(itemId);
        if (item != null) {
            item.setQuantity(newQuantity);
            System.out.println("Quantity updated successfully.");
        } else {
            System.out.println("Item not found!");
        }
    }

    // Search item by ID
    public Item searchById(String itemId) {
        return items.get(itemId);
    }

    // Search item by name
    public Item searchByName(String name) {
        for (Item item : items.values()) {
            if (item.getItemName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    // Display all items
    public void displayAllItems() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Item item : items.values()) {
                System.out.println(item);
            }
        }
    }
}