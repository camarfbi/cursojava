package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

/*		// instanciar a variavel vect com a quantidade de itens no vetor
		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}

		double sum = 0.0;

		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}
		double avg = sum / n;
		
		System.out.printf("%.2f%n", avg);
*
*
*/
		Product[] vect = new Product[n];
		
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();	
		}
		
		double avg = sum / n;
		
		System.out.printf("%.2f%n", avg);
		
		sc.close();

	}

}
