package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Product # " + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char cui = 0;
			cui = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			if (cui == 'i') {
				System.out.print("Customs Fee: ");
				Double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
				else if (cui == 'u') {
				System.out.print("Manufacture Date: ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name, price, date));
			}
				else {
				list.add(new Product(name, price));
				}
		}
		
		System.out.println("PRICE TAG:");
		for (Product prod : list) {
			System.out.println(prod.priceTag());	
		}
		sc.close();
	}

}
