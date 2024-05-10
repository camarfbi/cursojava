package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Services.ContractService;
import Services.OnlinePaymentService;
import Services.PaypalService;
import entities.Contract;
import entities.Installments;

//4 Passo - 
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//formato data
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter with the data contract: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date: ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Contract Value: ");
		double totalValue = sc.nextDouble();
		
		//5 Passo - instanciando o contrato para receber os dados
		Contract obj = new Contract(number, date, totalValue);
		
		System.out.print("Enter the number of the installments: ");
		int n = sc.nextInt();
		
		//9 Passo
		ContractService contractServive = new ContractService(new PaypalService());
		//10 Passo
		contractServive.processContract(obj, n);
		//11 Passo
		System.out.println("Parcelas: ");
		//13 Passo
		for(Installments installment : obj.getInstallments()) {
			System.out.println(installment);
		}
		
		sc.close();
	}

}
