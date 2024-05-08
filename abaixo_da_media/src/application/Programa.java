package application;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, sumpar = 0;
		double soma = 0;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		double[] vetor = new double[n];
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
			if(vetor[i] % 2 == 0) {
				soma += vetor[i];
				sumpar++;
			}
		}
		double media = soma / sumpar;
		

/*		System.out.println("\nMEDIA DO VETOR = " + media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for(int i = 0; i < n; i++) {
			if(vetor[i] < media) {
				System.out.println(vetor[i]);
			}
		}
*/
		if(media > 0) {
			System.out.println("MEDIA DOS PARES = " + media);
		}
		else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		sc.close();
	}

}
