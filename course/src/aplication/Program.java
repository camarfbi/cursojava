package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		Product product = new Product(); Eliminado ao instanciar um construtor		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
//		product.name = sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Price: ");
//		product.price = sc.nextLine();
		double price = sc.nextDouble();
//		System.out.print("Quantity in stock: ");
//		product.quantity = sc.nextInt();
//		int quantity = sc.nextInt();
		
		Product product = new Product(name, price);
		
		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());
		
		
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		sc.close();
	}

}
