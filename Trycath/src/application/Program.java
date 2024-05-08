package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) /*throws ParseException*/ {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.println("Room number: ");
			int number = sc.nextInt();
			System.out.println("Check-in date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.println("Check-out date (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());
			
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.println("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.println("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			reservation.updateDates(checkIn, checkOut);	
			System.out.println("Reservation: " + reservation);
		}
		
		catch (ParseException e) {
			System.out.println("Invalide date format");
		}
		
		catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		
		/*SOLUCAO RUIM 
		//criar uma data com a data de agora
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			System.out.println("Error in reservation: Reservation dates for update must be future dates");
		}
		//checa se o checkout é depois do checkin
		else if(!checkOut.after(checkIn)) {
				System.out.println("Error in reservation: Check-out date must be after check-in date");
		}
		else {
		reservation.updateDates(checkIn, checkOut);
		
		//Solucao menos pior
		String error = reservation.updateDates(checkIn, checkOut);
		if(error != null) {
			System.out.println("Error in reservation: " + error);
		}
		else {
			System.out.println("Reservation: " + reservation);
		}
		
		
							
		/*checa se o checkout é depois do checkin
		if(!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		}
		else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.println("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.println("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			/*SOLUCAO RUIM 
			//criar uma data com a data de agora
			Date now = new Date();
			if (checkIn.before(now) || checkOut.before(now)) {
				System.out.println("Error in reservation: Reservation dates for update must be future dates");
			}
			//checa se o checkout é depois do checkin
			else if(!checkOut.after(checkIn)) {
					System.out.println("Error in reservation: Check-out date must be after check-in date");
			}
			else {
			reservation.updateDates(checkIn, checkOut);
			
			//Solucao menos pior
			String error = reservation.updateDates(checkIn, checkOut);
			if(error != null) {
				System.out.println("Error in reservation: " + error);
			}
			else {
				System.out.println("Reservation: " + reservation);
			}
			//}
		}*/
		
		//SOLUCAO BOA
		
		
		
		sc.close();

	}

}
