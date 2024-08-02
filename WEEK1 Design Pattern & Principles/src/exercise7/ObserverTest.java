package exercise7;

public class ObserverTest {
 public static void main(String[] args) {
     // Create a stock market
     StockMarket stockMarket = new StockMarket();

     // Create observers
     Observer mobileApp = new MobileApp();
     Observer webApp = new WebApp();

     // Register observers
     stockMarket.registerObserver(mobileApp);
     stockMarket.registerObserver(webApp);

     // Set stock prices
     stockMarket.setStockPrice("AAPL", 150.0);
     stockMarket.setStockPrice("GOOG", 2500.0);

     // Deregister an observer
     stockMarket.deregisterObserver(mobileApp);

     // Set stock price again
     stockMarket.setStockPrice("AAPL", 160.0);
 }
}
