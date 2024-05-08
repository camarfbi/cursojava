package entities;

public class Account1 {

	//atributos	
	private int numAccount;
	private String name;
	private double balance;
	
	//contrutor
	public Account1() {
		
	}
	
	public Account1(int numAccount, String name, double initialDeposit) {
		this.numAccount = numAccount;
		this.name = name;
		addBalance(initialDeposit);
	}
	
	public Account1(int numAccount, String name) {
		this.numAccount = numAccount;
		this.name = name;
	}

	//consulta geters e seters
	public int getNumAccount() {
		return numAccount;
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}

	//metodos
	public void addBalance(double amount) {
		this.balance += amount;
	}
	public void takeBalance(double amount) {
		this.balance -= amount + 5.0;
	}
	public String toString() {
		return 	"Account "
				+ numAccount
				+", Holder: "
				+ name
				+", Balance: $"
				+ String.format("%.2f", balance);
	}
	
}
