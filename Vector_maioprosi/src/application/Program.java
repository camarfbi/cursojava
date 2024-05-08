package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, posicao = 0;
		double maior = 0;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		double[] vector = new double[n];
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vector[i] = sc.nextDouble();
			if (vector[i] > maior) {
				maior = vector[i];
				posicao = i;
			}
		}
		System.out.println("\nMAIOR VALOR = " + maior);
		System.out.println("POSICAO DO MAIOR VALOR = " + posicao);
		
		sc.close();
	}
	
}
