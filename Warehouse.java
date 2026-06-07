// this isClass: Warehouse
public class Warehouse {
    private Inventory inventory;
    private Scanner scanner;

    public Warehouse() {
        inventory = new Inventory();
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\n--- Warehouse Inventory Management ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Update Item Quantity");
            System.out.println("4. Search Item by ID");
            System.out.println("5. Search Item by Name");
            System.out.println("6. Display All Items");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addItemMenu();
                    break;
                case 2:
                    removeItemMenu();
                    break;
                case 3:
                    updateQuantityMenu();
                    break;
                case 4:
                    searchByIdMenu();
                    break;
                case 5:
                    searchByNameMenu();
                    break;
                case 6:
                    inventory.displayAllItems();
                    break;
                case 7:
                    System.out.println("Exiting... Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private void addItemMenu() {
        System.out.print("Enter Item ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Item Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Quantity: ");
        int qty = scanner.nextInt();
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        Item item = new Item(id, name, qty, price);
        inventory.addItem(item);
    }

    private void removeItemMenu() {
        System.out.print("Enter Item ID to remove: ");
        String id = scanner.nextLine();
        inventory.removeItem(id);
    }

    private void updateQuantityMenu() {
        System.out.print("Enter Item ID to update: ");
        String id = scanner.nextLine();
        System.out.print("Enter new Quantity: ");
        int qty = scanner.nextInt();
        scanner.nextLine();
        inventory.updateQuantity(id, qty);
    }

    private void searchByIdMenu() {
        System.out.print("Enter Item ID to search: ");
        String id = scanner.nextLine();
        Item item = inventory.searchById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Item not found!");
        }
    }

    private void searchByNameMenu() {
        System.out.print("Enter Item Name to search: ");
        String name = scanner.nextLine();
        Item item = inventory.searchByName(name);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Item not found!");
        }
    }

    // Main method
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.start();
    }
}
