package Exercise3;

public class BubbleSort {
	 public static void bubbleSort(Order[] orders) {
	        int n = orders.length;
	        for (int i = 0; i < n; i++) {
	            boolean swapped = false;
	            for (int j = 0; j < n - i - 1; j++) {
	                if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) {
	                    // Swap values
	                    Order temp = orders[j];
	                    orders[j] = orders[j + 1];
	                    orders[j + 1] = temp;
	                    swapped = true;
	                }
	            }
	            if (!swapped) {
	                break;
	            }
	        }
	    }

	    public static void printOrders(Order[] orders) {
	        for (Order order : orders) {
	            System.out.println(order);
	        }
	    }

	    public static void main(String[] args) {
	        Order[] orders = new Order[] {
	            new Order(1, "John Doe", 100.0),
	            new Order(2, "Jane Doe", 50.0),
	            new Order(3, "Bob Smith", 200.0)
	        };

	        bubbleSort(orders);
	        printOrders(orders);
	    }
}
