

class Product {
    private String productName;
    private int quantity;
    private int threshold;

    
    public Product(String productName, int quantity, int threshold) {
        this.productName = productName;
        this.quantity = quantity;
        this.threshold = threshold;
    }

    
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
class InventoryManager {
    private Product[] products;

    public InventoryManager(Product[] products) {
        this.products = products;
    
    public void checkLowStock() {
        System.out.println("Checking Inventory...\n");

        for (Product product : products) {
            if (product.getQuantity() < product.getThreshold()) {
                System.out.println("Product: " + product.getProductName()
                        + " - Low Stock Alert!");
            } else {
                System.out.println("Product: " + product.getProductName()
                        + " - Stock OK");
            }
        }
    }

    
    public void displayInventory() {
        System.out.println("\nInventory Details:");
        for (Product product : products) {
            System.out.println("Product Name: " + product.getProductName());
            System.out.println("Quantity: " + product.getQuantity());
            System.out.println("Threshold: " + product.getThreshold());
            System.out.println("---------------------------");
        }
    }
}


public class WarehouseInventoryTracker {
    public static void main(String[] args) {


        Product p1 = new Product("Laptop", 15, 10);
        Product p2 = new Product("Mouse", 5, 10);
        Product p3 = new Product("Keyboard", 20, 10);

        
        Product[] products = {p1, p2, p3};

        InventoryManager manager = new InventoryManager(products)
        manager.displayInventory();

        
        manager.checkLowStock();
    }
}
