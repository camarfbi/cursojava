package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
	
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	
	// macete long para calcular a diferenca entre datas,	
	public long duration() {
		//calcula a diferenca em milessegundos, utilizando getTime()"devolve a quantidade de milesegundos da data.. pega a diferenca entre datas em milesegundos"
		long diff = checkOut.getTime() - checkIn.getTime();
		//TimeUnit é um tipo enumarado complexo que contem algumas operacoes. TimeUnit pega a quantidade diff que estava em milesegundos e converte em dias 
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);		
	}
	
	//Recebe duas datas novas e atualiza 
	//public void updateDates(Date checkIn, Date checkOut) { usado no método ruim
	
	// usado no método menos ruim
	//public String updateDates(Date checkIn, Date checkOut) {
		public void updateDates(Date checkIn, Date checkOut) throws DomainException {
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Reservation dates for update must be future dates");
		}
		//checa se o checkout é depois do checkin
		if(!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
			
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		//return null; //não deu erro no metodo
		}
	
	@Override
	public String toString() {
		return "Room "
				+ roomNumber
				+ ", check-in "
				+ sdf.format(checkIn)
				+ ", check-out "
				+ sdf.format(checkOut)
				+ ", "
				+ duration()
				+ " nights";
	}
	

}
