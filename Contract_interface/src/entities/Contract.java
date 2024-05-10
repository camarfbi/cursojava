package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//2 Passo
public class Contract {
	
	private Integer number;
	private LocalDate date;
	private Double totalValue;

	//3 Passo - Instanciar lista, pois um contrato recebe varias parcelas e precisam ser armazenadas em um arraylist
	private List<Installments> installments = new ArrayList<>();
	
	public Contract() {
	}
	//sem a lista
	public Contract(Integer number, LocalDate date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installments> getInstallments() {
		return installments;
	}
	//nao tem set da lista
	
}
