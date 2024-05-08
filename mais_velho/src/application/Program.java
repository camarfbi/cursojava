package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, velha = 0, posicao = 0;
		
		System.out.println("Quantas pessoas voce vai digitar?");
		n = sc.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		
		for(int i = 1; i < n; i++) {
			if(idade[i] > velha) {
				velha = idade[i];
				posicao = i;
			}
		}
		System.out.println("PESSOA MAIS VELHA: " + nome[posicao]); 
			
		sc.close();
	}

}
