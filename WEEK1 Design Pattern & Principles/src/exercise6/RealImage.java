package exercise6;

public class RealImage implements Image {
 private String url;

 public RealImage(String url) {
     this.url = url;
     loadFromServer();
 }

 private void loadFromServer() {
     System.out.println("Loading image from server: " + url);
     // Simulate loading time
     try {
         Thread.sleep(2000);
     } catch (InterruptedException e) {
         Thread.currentThread().interrupt();
     }
 }

 @Override
 public void display() {
     System.out.println("Displaying image: " + url);
 }
}
