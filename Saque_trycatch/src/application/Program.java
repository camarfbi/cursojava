package application;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import model.exception.BusinnesException;

public class Program {

	public static void main(String[] args) throws BusinnesException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		try {
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine() ;
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withDrawLimit = sc.nextDouble();
		
		Account account = new Account(number,holder,balance,withDrawLimit);
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		
		//saque com metodo withDraw
		account.withDraw(amount);
		
		System.out.printf("New balance: %.2f ", account.getBalance());
		}
		catch (BusinnesException e) {
			System.out.println(e.getMessage());
		}
		
		
		sc.close();
	}
}
