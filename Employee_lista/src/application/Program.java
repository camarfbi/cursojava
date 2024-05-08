package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employee will be registred? ");
		n = sc.nextInt();
		System.out.println();
		for(int i = 0; i < n; i++) {	
		System.out.println("Employee #" + (i+1) + ": " );
		System.out.print("Id:");
		int id = sc.nextInt();
		while(hasId(list, id)) {
			System.out.println("Id already taken! Try again: ");
			System.out.print("Id:");
			id = sc.nextInt();
		}
		
		
		System.out.print("Name: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Salary: ");
		double salary = sc.nextDouble();
		
		Employee emp = new Employee(id, name, salary);
		
		list.add(emp);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		//le funcionario
		int idSalary = sc.nextInt();
		// procura a posicao do id do funcionario
		
		// usando busca pela list.stream (funcao lambda)
		Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		
		if(emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of Employee");
		for (Employee empl : list) {
			System.out.println(empl);
		}
		
/*		//busca pelo metodo manual
		Integer pos = position(list, idSalary); 
		
		//Se o id nao for encontrado, exibe msg
		if( pos == null) {
			System.out.println("This id does not exist!");
		}
		//se nao, pergunta porcentagem e incrementa o aumento
		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		
		System.out.println();
		System.out.println("List of Employee");
		for (Employee emp : list) {
			System.out.println(emp);
		}
*/
		
		sc.close();
	}
	
	public static Integer position(List<Employee> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
