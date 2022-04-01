package gestion.show.model;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Ticket {
	
	private boolean available;
	private String showTitle;
	private LocalDateTime dateOfShow;
	
	private SubscriptionSeries series;
	private ReservationIndividual individual;
	public Ticket(boolean available, String showTitle, LocalDateTime dateOfShow) {
		super();
		this.available = available;
		this.showTitle = showTitle;
		this.dateOfShow = dateOfShow;
	}
	
	

}
