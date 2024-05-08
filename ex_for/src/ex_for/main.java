package ex_for;

import java.util.Scanner;

public class main {
	public static void Main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int x = sc.nextInt();
		
		for (int i = 1; i<=x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
					
		}
	sc.close();
	}
}