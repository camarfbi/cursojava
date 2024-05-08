package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Quantas pessoas serao digitadas? ");
		
		int n = sc.nextInt();
		String vectorName[] = new String[n];
		int vectorAge[] = new int[n];
		double vectorHeight[] = new double[n];
		double heightSum = 0;
		int heightMenor = 0;
			
		for(int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			vectorName[i] = sc.next();
			System.out.print("Idade: ");
			vectorAge[i] = sc.nextInt();
			System.out.print("Altura: ");
			vectorHeight[i] = sc.nextDouble();
		}
		for(int i = 0; i < n; i++) {
		heightSum += vectorHeight[i];
		if(vectorAge[i] < 16) {
			heightMenor++;
			}
		}

		
		System.out.println("Altura média: " + heightSum / n);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", ((double)heightMenor / n) * 100);
		for(int i = 0; i < n; i++) {
			if(vectorAge[i] < 16) {
				System.out.println(vectorName[i]);
			}
		}		
		
		sc.close();
	}

}
