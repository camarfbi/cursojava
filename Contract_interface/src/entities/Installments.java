package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//1 - Passo
public class Installments {
	
	//formato data
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate date;
	private Double amount;
	
	public Installments() {
	}
	
	public Installments(LocalDate date, Double amount) {
		super();
		this.date = date;
		this.amount = amount;
	}

	public LocalDate getDueDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	//12 Passo - implementando impressao das parcelas com data formatada e valores
	@Override
	public String toString() {
		return date.format(fmt) + " - " + String.format("%.2f", amount);
	}
	
	

}
