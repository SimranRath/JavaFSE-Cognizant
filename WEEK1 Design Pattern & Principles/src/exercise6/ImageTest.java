package exercise6;

public class ImageTest {
 public static void main(String[] args) {
     // Create Proxy images
	 
     Image image1 = new ProxyImage("http://example.com/image1.jpg");
     Image image2 = new ProxyImage("http://example.com/image2.jpg");

     // Display images
     image1.display();
     image2.display();

     // Display image1 again to demonstrate caching
     image1.display();
 }
}
