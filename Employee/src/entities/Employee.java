package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	public double percentage;
	
	
	public double netSalary() {
		return grossSalary - tax;		
	}
	
	public double increaseSalary(double percentage) {
		return this.grossSalary += grossSalary * percentage/100.00 ;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
	
}
