package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, numh = 0;
		double menor = 3.0, maior = 0, mediam = 0, numm = 0;
		
		System.out.print("Quantas pessoas serao digitadas?");
		n = sc.nextInt();
		
		double[] alt = new double[n];
		char[] gen = new char[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Altura da " + (1+i) + "a pessoa: ");
			alt[i] = sc.nextDouble();
			System.out.print("Genero da " + (1+i) + "a pessoa: ");
			gen[i] = sc.next().charAt(0);
			if(gen[i] == 'M') {
				numh++;
			}
			else {
				mediam += alt[i];
				numm++;
			}
		}
		for(int j = 0; j < n; j++) {
			if(alt[j] > maior) {
				maior = alt[j];
			}
			if(alt[j] < menor) {
				menor = alt[j];
			}
		}
		
		System.out.println("Menor altura =" + menor);
		System.out.println("Maior altura =" + maior);
		System.out.printf("Media das alturas das mulheres = %.2f \n",  (mediam/numm));
		System.out.println("Numero de homens = " + numh);
		
		sc.close();
	}
}
