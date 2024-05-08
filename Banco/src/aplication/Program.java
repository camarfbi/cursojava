package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Account1;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account1 account1;
		
		System.out.print("Enter account number: ");
		int numAccount = sc.nextInt();
		System.out.print("Enter account name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println();
		System.out.print("Is there na initia deposit (y/n)? ");
		char y = sc.next().charAt(0);
		if (y == 'y') {
			double initialDeposit = sc.nextDouble();
			account1 = new Account1(numAccount, name, initialDeposit);
		}
		else {
			account1 = new Account1(numAccount, name);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account1);
		
		System.out.println();		
		System.out.print("Enter a deposit value: ");
		double depoisitValue = sc.nextDouble();
		account1.addBalance(depoisitValue);
		System.out.println("Update account data: ");
		System.out.println(account1);
		
		System.out.println();
		System.out.print("Enter a whitdraw value: ");
		double balance = sc.nextDouble();
		account1.takeBalance(balance);
		System.out.println("Update account data: ");
		System.out.println(account1);

		System.out.println("");

		sc.close();
	}

}
