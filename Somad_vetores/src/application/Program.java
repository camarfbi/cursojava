package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Quantos alunos serao digitados?");
		n = sc.nextInt();
		String[] alunos = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno:");
			sc.nextLine();
			alunos[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}
		System.out.println("Alunos aprovados");
		for(int i = 0; i < n; i++) {
			if ((nota1[i] + nota2[i])/2 >= 6.0) {
				System.out.println(alunos[i]);
			}
		}
		
		
		
		
		sc.close();
	}

}
