package entities;

public class BusinessPerson extends Person {
	
	private Integer numberEmployee;
	
	public BusinessPerson() {
		super();
	}

	public BusinessPerson(String name, Double yearIncome, Integer numberEmployee) {
		super(name, yearIncome);
		this.numberEmployee = numberEmployee;
	}

	public Integer getNumberEmployee() {
		return numberEmployee;
	}

	public void setNumberEmployee(Integer numberEmployee) {
		this.numberEmployee = numberEmployee;
	}

	@Override
	public Double taxDue() {
		if(getNumberEmployee() < 10) {
			return getYearIncome() * 0.16;
		}
		else {
			return getYearIncome() * 0.14;
		}
	}
}
