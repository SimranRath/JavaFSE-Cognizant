package exercise7;

public class WebApp implements Observer {
    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("Web App: Stock price updated - " + stockName + ": " + stockPrice);
    }
}