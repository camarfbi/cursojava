package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strString = sc.nextLine();
		
		File path = new File(strString);
		
		System.out.println("getPath: " + path.getPath());
		System.out.println("getAbsolutePath: " + path.getAbsolutePath());
		System.out.println("getCanonicalPath: " + path.getCanonicalPath());
		System.out.println("getFreeSpace: " + path.getFreeSpace());
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getTotalSpace: " + path.getTotalSpace());
		System.out.println("getUsableSpace: " + path.getUsableSpace());
		System.out.println("getAbsoluteFile: " + path.getAbsoluteFile());
		System.out.println("getClass: " + path.getClass());
		System.out.println("getParentFile: " + path.getParentFile());
		
		sc.close();
	}

}
