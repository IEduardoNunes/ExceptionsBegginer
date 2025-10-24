package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.entities;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int roomNumber = sc.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		
		entities reservation = new entities(roomNumber, checkIn, checkOut);
		System.out.println("Reservation: " + reservation);
	}

}
