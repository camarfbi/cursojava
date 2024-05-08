package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Insert a path file: ");
		String sourceFileStr = sc.nextLine();
		
		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		boolean success = new File(sourceFolderStr + "\\out").mkdir();
		
		String targetFileStr = sourceFolderStr + "\\out\\file.csv";
			
		//Cria um BufferedReader para ler de um arquivo especificado pelo caminho "path" e garante que o recurso seja fechado automaticamente após o uso.	
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
			//lê uma linha de texto do objeto BufferedReader e a armazena na var "line".
			String itemCsv = br.readLine();
			//Lê cada linha de texto arquivo do BufferedReader até que não haja mais linhas para ler (quando "line" se torna null).
			while(itemCsv != null) {
				String[] fields = itemCsv.split(","); //separa a string em substrings a partir do separador "," e aloca nas posições do array fields.
				String name = fields[0]; //aloca a substring da posicao 0 na var name 
				Double price = Double.parseDouble(fields[1]); //aloca a substring da posicao 1 e converte em double usando o parseDouble
				int quantity = Integer.parseInt(fields[2]); //idem e converte em Integer
				
				list.add(new Product(name, price, quantity)); //adiciona as var na list Product
				
				itemCsv = br.readLine(); //proxima linha
			}
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){ //BufferedWriter escreve texto armazenando em buffer * FileWriter: grava caracteres em um arquivo de texto * 
				
				for(Product item: list) {
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();					
				}
				System.out.println(targetFileStr + " Created!!");
				
			}catch(IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
			
		}
		catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();		
	}	
}
