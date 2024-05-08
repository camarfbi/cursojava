package entities;

public class PhysicalPerson extends Person{
	
	private Double healthSpending;
	
	public PhysicalPerson() {
		super();
	}

	public PhysicalPerson(String name, Double yearIncome, Double healthSpending) {
		super(name, yearIncome);
		this.healthSpending = healthSpending;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	@Override
	public Double taxDue() {
		if(getHealthSpending() == 0) {
			if(getYearIncome() < 20000) {
			return getYearIncome() * 0.15;
			}
			else {
			return getYearIncome() * 0.25;
			}
		}
		else {
			if(getYearIncome() < 20000) {
				return getYearIncome() * 0.15 - (getHealthSpending() * 0.50);
				}
				else {
				return getYearIncome() * 0.25 - (getHealthSpending() * 0.50);
				}
		}
	}
	
}
