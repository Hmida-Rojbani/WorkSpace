package gestion.show.model;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;

@Data
public class SubscriptionSeries extends Reservation {
	
	private int series;
	private List<Ticket> tickets;

	public SubscriptionSeries(LocalDateTime reservationDdate, Customer customer, int series) {
		super(reservationDdate, customer);
		this.series = series;
	}

	

}
