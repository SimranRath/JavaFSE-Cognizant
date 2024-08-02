package exercise7;

public interface Stock {
 void registerObserver(Observer observer);
 void deregisterObserver(Observer observer);
 void notifyObservers(String stockName, double stockPrice);
}
