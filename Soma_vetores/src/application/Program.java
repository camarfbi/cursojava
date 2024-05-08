package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		n = sc.nextInt();
		
		int[] vetorA = new int[n];
		
		System.out.println("Digite os valores do vetor A:");
		for(int i = 0; i < n; i++) {
			vetorA[i] = sc.nextInt();
		}	
		int[] vetorB = new int[n];
		
		System.out.println("Digite os valores do vetor B:");
		for(int i = 0; i < n; i++) {
			vetorB[i] = sc.nextInt();
		}
		int[] vetorC = new int[n];
		
		System.out.println("VETOR RESULTANTE");
		for(int i = 0; i < n; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			System.out.println(vetorC[i]);
		}
		sc.next();
	}
}
