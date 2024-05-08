package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.enums.Color;
import entities.Shape;
import entities.Rectangle;
import entities.Circle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of Shapes: ");
		int n = sc.nextInt();
		
		List<Shape> list = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data: ");
			System.out.print("Rectangle or Circle (c/r)? ");
			char rc = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());

			if(rc == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));	
			}
			else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
		
		}
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for ( Shape shape : list) {
		System.out.println("Shape: " + shape.getColor() + String.format(" %.2f", shape.area()));
		
		sc.close();		
	}

}
}
