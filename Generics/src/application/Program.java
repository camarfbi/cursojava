package application;

import java.util.Locale;
import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		PrintService<String> ps = new PrintService<>();
	
		System.out.print("How many values: ");
		int n = sc.nextInt();
		
		ps.addValue("Maria");
		
		for(int i = 0; i < n; i++) {
			String value =sc.next();
			ps.addValue(value);
		}
		ps.print();
		System.out.print("First: " + ps.first());
		sc.close();
	}

}
