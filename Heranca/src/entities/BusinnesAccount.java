package entities;

public class BusinnesAccount extends Account{
	
	private Double loanLimit;
	
	//construtor 
	public BusinnesAccount() {
		super(); //permite acesso a aos argumentos da superclasse
	}

	public BusinnesAccount(Integer number, String holder, Double balance, Double loanLimit) { //executa a logica da superclasse Account
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(Double amount) {
		if(amount <= loanLimit) {
			balance += amount -10.00;
		}
	}

	@Override //importante para o compilador identificar o médodo da superclasse
	//sobreposi da classe withdraw da class Account adicionando desconto de 2.00
	public void withdraw(double amount) {
		super.withdraw(amount); //desconta o valor de 5.00
		balance -= 2.0; //cobrescrevendo o método withdraw. sobreposição de método adicionando o desconto de 2.0.
	}
	
	
}
