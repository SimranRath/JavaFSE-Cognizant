package Exercise7;

	import java.util.HashMap;
	import java.util.Map;

	public class FinancialForecasting {

	    private static Map<Integer, Double> memo = new HashMap<>();

	    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
	        
	        if (memo.containsKey(years)) {
	            return memo.get(years);
	        }

	        if (years == 0) {
	            return presentValue;
	        } else {
	            double futureValue = presentValue * (1 + growthRate);
	            double result = calculateFutureValue(futureValue, growthRate, years - 1);
	            memo.put(years, result); 
	            return result;
	        }
	    }

	    public static void main(String[] args) {
	        double presentValue = 100; // initial investment
	        double growthRate = 0.02; // 5% growth rate
	        int years = 7; // forecast for 5 years

	        double futureValue = calculateFutureValue(presentValue, growthRate, years);
	        System.out.println("Future value after " + years + " years: " + futureValue);
	    }
	}

