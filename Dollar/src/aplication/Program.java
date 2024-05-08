package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.printf("What is dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.printf("How many dollar will be bought? ");
		double amount = sc.nextDouble();
		double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
		
		System.out.printf("Amount to be paind in reais = %.2f%n", result);
		
		sc.close();
		
	}

}
