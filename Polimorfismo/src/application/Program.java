package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourceEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>(); //instanciando lista
		
		System.out.println("Enter the number of employee");
		int n = sc.nextInt();
		for(int i=1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.println("Outsource (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Hours: ");
			int hour = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if (ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				list.add(new OutSourceEmployee(name, hour, valuePerHour, additionalCharge));
			}
			else {
				list.add(new Employee(name, hour, valuePerHour));
			}
		}
		System.out.println();
		System.out.println("Payments:");
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}

		sc.close();
	}

}
