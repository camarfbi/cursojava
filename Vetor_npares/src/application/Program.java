package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int count = 0;
				
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		int[] vector = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vector[i] = sc.nextInt();
		}
		System.out.println("\n");
		System.out.println("NUMEROS PARES");
		for(int i = 0; i < n; i++) {
			if(vector[i] % 2 == 0) {
				System.out.print(vector[i] + " ");
				count++;
			}
		}
		System.out.println("\n");
		System.out.println("QUANTIDADE DE PARES = " + count);
		
		sc.close();
		
	}

}
