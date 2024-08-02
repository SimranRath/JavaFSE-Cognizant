package Exercise1;

import java.util.HashMap;

public class Inventory {
	private HashMap<String,Product>
	Inventory;
	public Inventory() {
		Inventory=new HashMap<>();
	}
	public void addProduct(Product Product) {
		Inventory.put(Product.getPID(),Product);
	}
	 public void removeProduct( String  PID) { 
		if(Inventory.containsKey(PID)) {
			Inventory.remove(PID);
		}
	 }
	 public void updateProduct(Product product) {
	     if (Inventory.containsKey(product.getPID())) {
	         Inventory.put(product.getPID(), product);
	     } else {
	         System.out.println("Product not found.");
	     }
	 }
	 public void listProducts() {
	     for (Product product : Inventory.values()) {
	         System.out.println(product.getPname() + ": " + product.getquantity() + " units at $" + product.getprice());
	     }
	 }


		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Inventory i = new Inventory();
	        
	        Product product1 = new Product("001", "Product 1", 10, 99.99);
	        Product product2 = new Product("002", "Product 2", 20, 199.99);

	        i.addProduct(product1);
	        i.addProduct(product2);

	        i.listProducts();

	        product1.setprice(89.99);
	        i.updateProduct(product1);

	        i.listProducts();

	        i.removeProduct("001");

	        i.listProducts();

		} 
}
