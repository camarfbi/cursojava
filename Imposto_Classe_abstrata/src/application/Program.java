package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Person;
import entities.PhysicalPerson;
import entities.BusinessPerson;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data");
			System.out.print("Individual or company (i/c)? ");
			char ic = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double yearIncome = sc.nextDouble();
		
			if(ic == 'i') {
				System.out.print("Health expendirures: ");
				double healthSpending = sc.nextDouble();

				list.add(new PhysicalPerson(name, yearIncome, healthSpending));
			}
			else {
				System.out.print("Number of Employees: ");
				int numberEmployee = sc.nextInt();
				
				list.add(new BusinessPerson(name, yearIncome, numberEmployee));
			}
		}
		System.out.println();
		double totalTax = 0;		
		System.out.println("TAXES PAID:");
		for(Person person : list) {
		System.out.println(person.getName() + ": $ " + String.format("%.2f", person.taxDue()));
		totalTax += person.taxDue();
		}
		System.out.println();
		System.out.println("TOTAL TAXES: " + totalTax);
		
		sc.close();
	}

}
