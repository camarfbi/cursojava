package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	//atributos basicos
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	//associacoes de atributos com outras classes || COMPOSICAO DE OBJETOS
	private Department department;
	private List <HourContract> contracts = new ArrayList<>(); //instanciar lista por padrão, a lista tem que ser instanciada!(adiciona = new ArrayList<>(); na declarando do atributo) 
	
	public Worker() {
	}

	//não incluir no construtor atributo que contenha lista "Tem muitos"... tem que instanciar na classe, pode ser instanciada na declaracao do atributo "private List <HourContract> contracts = new ArrayList<>()"
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	//não esquecer de remover setContract para não criar nova lista
	
	//implementacao dos metodos
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance(); // converte data para verificar no loop
		for(HourContract c : contracts) {
			cal.setTime(c.getDate()); //pega data do contrato e define como sendo a data do calendário
			int c_year = cal.get(Calendar.YEAR); //pega o ano do cal
			int c_month = 1 + cal.get(Calendar.MONTH); //mes da var cal | add 1 pq a data do calendar inicia no 0
			if(year == c_year && month == c_month) { //se year informado como parametro for = c_year do contrato cadastrado
				sum += c.totalValue(); //soma o valor
			}
		}
		return sum;
	}
}
