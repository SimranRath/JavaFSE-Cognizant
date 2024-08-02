package Exercise3;

public class Order {
	int orderId;
    String customerName;
   double totalPrice;

   public Order(int orderId, String customerName, double totalPrice) {
       this.orderId = orderId;
       this.customerName = customerName;
       this.totalPrice = totalPrice;
   }

   public int getOrderId() {
       return orderId;
   }

   public String getCustomerName() {
       return customerName;
   }

   public double getTotalPrice() {
       return totalPrice;
   }

   @Override
   public String toString() {
       return "Order " + orderId + ": " + customerName + ", Total Price: " + totalPrice;
   }
}
