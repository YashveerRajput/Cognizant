import java.util.*;
public class EcommerceSearch {

    // Linear Search
    public static Product linearSearch(Product[] products, int targetId) {

        //for loop for the traversal
        for (Product product : products) {
            if (product.productId == targetId) {
                return product;
            }
        }

        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int targetId) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (products[mid].productId == targetId) {
                return products[mid];
            }

            if (products[mid].productId < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
            new Product(105, "Laptop", "Electronics"),
            new Product(101, "Shoes", "Fashion"),
            new Product(103, "Phone", "Electronics"),
            new Product(102, "Watch", "Accessories"),
            new Product(104, "Bag", "Fashion")
        };

        int targetId = 103;

        System.out.println(" Linear Search ");

        Product result1 = linearSearch(products, targetId);

        if (result1 != null) {
            result1.display();
        } else {
            System.out.println("Product Not Found");
        }

        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        System.out.println(" Binary Search ");

        Product result2 = binarySearch(products, targetId);

        if (result2 != null) {
            result2.display();
        } else {
            System.out.println("Product Not Found");
        }
    }
}