package gestion.show.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ReservationIndividual extends Reservation {

	private List<Ticket> tickets = new ArrayList<>();
	
	public ReservationIndividual(LocalDateTime reservationDdate, Customer customer) {
		super(reservationDdate, customer);
	}

	public static ReservationIndividual makeIndivReservation(Customer customer,String showTitle, LocalDateTime reservationDate) {
		ReservationIndividual individual = null;
		for (Ticket ticket : DB.tickets) {
			if(ticket.getShowTitle().equals(showTitle)
			&& ticket.getDateOfShow().isEqual(reservationDate)
			&& ticket.isAvailable()) {
				 individual = new ReservationIndividual(reservationDate, customer);
				ticket.setAvailable(false);
				individual.tickets.add(ticket);
				DB.reservations.add(individual);
			}
		}
		if(individual == null) {
			System.err.println("No Available Show");
		}
		return individual;
	}
	
	public static List<ReservationIndividual> makeManyIndivReservation(Customer customer,int nbReservation,String showTitle, LocalDateTime reservationDate) {
		List<ReservationIndividual> individuals = null;
		
		return individuals;
	}
	

	

}
