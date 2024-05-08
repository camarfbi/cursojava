package entities;

import java.util.Date;

public class HourContract {
	
	private Date date;
	private Double valuePerHour;
	private Integer hours;

	
	public HourContract() {
	}

	public HourContract(Date date, Double valuePerHouer, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHouer;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHouer() {
		return valuePerHour;
	}

	public void setValuePerHouer(Double valuePerHouer) {
		this.valuePerHour = valuePerHouer;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public double totalValue() {
		return valuePerHour * hours; 
	}
}
