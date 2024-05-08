package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Studant;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Studant studant = new Studant();
		
		System.out.println("Name: ");
		studant.name = sc.nextLine();
		System.out.print("Primeira nota: ");
		studant.note1 = sc.nextDouble();
		System.out.print("Segunda nota: ");
		studant.note2 = sc.nextDouble();
		System.out.print("Terceira nota: ");
		studant.note3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", studant.mediaFinal());
		
		
		if(studant.missing() < 60.00) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", studant.missing());
		}
		else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
