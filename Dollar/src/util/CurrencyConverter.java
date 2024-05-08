package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double dollarToReal(double amount, double dollarPrice) {
		double total = amount  * dollarPrice;		
		return total + total * IOF;
	}
}
