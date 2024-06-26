package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //tratando string para 
		
		Comment c1 = new Comment("Fabio: ", "Have a nice trip!");
		Comment c2 = new Comment("Bia: ", "Wow thats awesome!");
		Post p1 = new Post(
				sdf.parse("27/12/2022 13:05:44"),
				"Traveling to New Zeland",
				"I'm going to visit this beatifull country",
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment c3 = new Comment("Ana: ", "Good Luck!");
		Comment c4 = new Comment("Fabi: ", "Wow!");
		Post p2 = new Post(
				sdf.parse("20/07/2023 13:05:44"),
				"Traveling to New Zeland",
				"I'm going to visit this beatifull country",
				12);

		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);
		
		sc.close();

	}

}
