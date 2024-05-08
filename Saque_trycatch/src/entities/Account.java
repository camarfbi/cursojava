package entities;

import java.util.zip.DataFormatException;

import model.exception.BusinnesException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;
	
	public Account() {
		
	}
	
	public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getWithDrawLimit() {
		return withDrawLimit;
	}

	public void setWithDrawLimit(Double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void deposit (double amount) {
		balance += amount;
	}
	
	public void withDraw(double amount) {
		validateWithDraw(amount); //chama antes de efetuar o saque
		balance -= amount;
	}
	
	private void validateWithDraw(double amount) throws BusinnesException {
			if(amount > withDrawLimit) {
				throw new BusinnesException ("Withdraw error: The amount exceeds withdraw limit");
			}
			if(amount > balance) {
				throw new BusinnesException ("Withdraw error: Not enough balance");
			}
	}

}
