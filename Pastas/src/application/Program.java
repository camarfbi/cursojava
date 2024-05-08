package application;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);		
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("folders: ");
		for (File folder: folders) {
			System.out.println(folder);
		}
		File[] files = path.listFiles(File::isFile);
		System.out.println("files: ");
		for (File file: files) {
			System.out.println(file);
		}
		
		boolean sucess = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created sucessfully: " + sucess);
		
		sc.close();
	}

}