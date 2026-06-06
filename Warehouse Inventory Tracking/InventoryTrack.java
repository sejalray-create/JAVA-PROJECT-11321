// Product Class
class Product {
    private String productName;
    private int quantity;
    private int threshold;

    // Constructor using this keyword
    public Product(String productName, int quantity, int threshold) {
        this.productName = productName;
        this.quantity = quantity;
        this.threshold = threshold;
    }

    // Getter methods
    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getThreshold() {
        return threshold;
    }
}

// InventoryManager Class
class InventoryManager {
    private Product[] products;

    public InventoryManager(Product[] products) {
        this.products = products;
    }

    // Check stock levels
    public void checkLowStock() {
        System.out.println("Checking Inventory...\n");

        for (Product p : products) {
            if (p.getQuantity() < p.getThreshold()) {
                System.out.println("Product: " + p.getProductName()
                        + " - Low Stock Alert!");
            } else {
                System.out.println("Product: " + p.getProductName()
                        + " - Stock OK");
            }
        }
    }

    // Display complete inventory
    public void displayInventory() {
        System.out.println("\nInventory Details:");
        for (Product p : products) {
            System.out.println("Product Name: " + p.getProductName()
                    + ", Quantity: " + p.getQuantity()
                    + ", Threshold: " + p.getThreshold());
        }
    }
}

// Main Class
public class InventoryTrack {
    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 20, 10);
        Product p2 = new Product("Mouse", 5, 10);
        Product p3 = new Product("Keyboard", 15, 10);

        Product[] products = {p1, p2, p3};

        InventoryManager manager = new InventoryManager(products);

        manager.checkLowStock();
        manager.displayInventory();
    }
}