package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar? ");
		int N = sc.nextInt();
		int vetor[] = new int[N];		
		for(int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();			
		}
		System.out.println("NUMEROS NEGATIVOS:");
		for(int j = 0; j < N; j++) {
			if(vetor[j] < 0) {
				System.out.println(vetor[j]);
			}
		}
		
		System.out.print("Quantos numeros voce vai digitar? ");
		
		int soma = 0, media = 0;
		int n = sc.nextInt();
		
		double vector[] = new double[n];
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vector[i] = sc.nextDouble();
			soma += vector[i];
		}
		System.out.print("VALORES = ");	
		for(int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + " ");	
		}
		System.out.println();
		System.out.println("SOMA = " + soma);
		System.out.println("MEDIA = " + soma/n);
		
		sc.close();
	}

}
