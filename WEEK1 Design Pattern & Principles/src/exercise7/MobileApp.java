package exercise7;

	public class MobileApp implements Observer {
	    @Override
	    public void update(String stockName, double stockPrice) {
	        System.out.println("Mobile App: Stock price updated - " + stockName + ": " + stockPrice);
	    }
	}

