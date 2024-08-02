package Exercise2;

public class linearSearch {
	
	    public static product LinearSearch(product[] products, int productId) {
	        for (product product : products) {
	            if (product.getProductId() == productId) {
	                return product;
	            }
	        }
	        return null;
	    }}
