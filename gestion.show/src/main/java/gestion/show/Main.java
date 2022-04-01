package gestion.show;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import gestion.show.model.Customer;
import gestion.show.model.DB;
import gestion.show.model.ReservationIndividual;
import gestion.show.model.Ticket;

public class Main {

	public static void main(String[] args) {
		Customer customerIndiv = new Customer("Ali", "1224343");		
		Customer customerSerie = new Customer("Mohamed", "1224344");		
	
		ReservationIndividual.makeIndivReservation(customerIndiv, "Dachera", LocalDateTime.parse("2020-04-01T11:30"));
		System.out.println(DB.tickets);
		System.out.println(DB.reservations);
	}
}
