package Exercise3;

public class Main {
	public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Alice", 250.50),
            new Order(2, "Bob", 100.00),
            new Order(3, "Charlie", 300.00),
            new Order(4, "David", 150.75)
        };

        // Bubble Sort
        BubbleSort.bubbleSort(orders);
        System.out.println("Bubble Sorted Orders: ");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Reset array for Quick Sort
        orders = new Order[]{
            new Order(1, "Alice", 250.50),
            new Order(2, "Bob", 100.00),
            new Order(3, "Charlie", 300.00),
            new Order(4, "David", 150.75)
        };

        // Quick Sort
        QuickSort.quickSort(orders, 0, orders.length - 1);
        System.out.println("Quick Sorted Orders: ");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
