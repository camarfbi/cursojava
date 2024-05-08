package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinnesAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
//		Account acc = new Account(1001, "Alex", 0.0);
		BusinnesAccount bacc = new BusinnesAccount (1002, "Maria", 0.0 , 500.0);
		
		//upcasting atribui as variaveis de uma sub-classe e atribui na superclasse, pois toda subclasse e uma classe, convertendo uma superclasse em subclasse
		Account acc1 = bacc;
		Account acc2 = new BusinnesAccount(1003, "Fabio", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004,"Anna", 0.0, 0.01);
		
/*		Account acc6 = new Account(1006,"Alex", 1000.00); //inseriu dados na conta acc6
		acc6.withdraw(200.0); //sacou 200.00 com taxa de 5.00
		System.out.println(acc6.getBalance()); 
		
		Account acc7 = new SavingsAccount(1007,"Alex", 1000.00, 0.01); //inseriu dados na conta acc7
		acc7.withdraw(200.00); //chamou withdraw sacando 200.00 sem a taxa 5.00
		System.out.println(acc7.getBalance());
*/		
		Account acc8 = new BusinnesAccount(1008, "Bia", 1000.00, 500.00);
		acc8.withdraw(200);
		System.out.println("Nome: " + acc8.getHolder() + ", Valor: " + acc8.getBalance());
		
		//163 classes abstratas | declaração "abstract" na super classe "Account", não permite instanciar a Account, mas é possível utilizar as subclasses não abstratas
		List<Account> list = new ArrayList<>(); 
		
		list.add(new SavingsAccount(1009, "Alex", 500.00, 0.01));
		list.add(new BusinnesAccount(1010, "Maria", 300.00, 400.00));
		list.add(new SavingsAccount(1009, "Bob", 500.00, 0.01));
		list.add(new BusinnesAccount(1010, "Anna", 500.00, 200.00));
		
		double sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		for(Account acc : list) {
			acc.deposit(10.0);
		}
		
		for(Account acc : list) {
			System.out.println("Conta: "+ acc.getNumber() + ", " + acc.getHolder() + ", Saldo: "  + acc.getBalance());
		}	//fim da aula de classes abstratas 
		
		//Downcasting converte um objeto da superclasse para subclasse processo inverso
		
		//forçar a conversão fazendo casting manualmente (BusinnesAccount)acc2
		BusinnesAccount acc4 = (BusinnesAccount)acc2; 
		acc4.loan(100.00);
		
		//polimorfismo - 
		
//		Account x = new Account(1009, "Bia", 1000.0); // a associacao do tipo específico com o tipo generico é feita em tempo de execucao (upcasting)
		Account y = new SavingsAccount(1010, "Fabio", 1000.00, 0.01); //o compilador não sabe o tipo do metodo withdraw, so sabe que são do tipo account, na execucao do método que ele vonsulta o tipo se é account ou savingsaccount
		
//		x.withdraw(50.0); 
		y.withdraw(50.0);
		
//		System.out.println(x.getBalance() + " " + x.getHolder());
		System.out.println(y.getBalance() + " " + y.getHolder());
		
		
		
		//Verifica se é possivel fazer o Downcasting
		
		//BusinnesAccount acc5 = (BusinnesAccount)acc3; essa operação não é permitida pois são subclasses herdadas de tipos diferentes
		
		if (acc3 instanceof BusinnesAccount) { //"instanceof" testa se as classes são do mesmo tipo, se sim faz o casting acc5 = acc3
		BusinnesAccount acc5 = (BusinnesAccount)acc3; 
		acc5.loan(100.00);
		System.out.println("Loan!");
	}
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3; 
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}
}
