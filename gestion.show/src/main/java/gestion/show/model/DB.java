package gestion.show.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DB {
	
	public static List<Ticket> tickets = new ArrayList<>();
	public static List<Reservation> reservations = new ArrayList<>();
	
	static {
		tickets.add(new Ticket(true, "Dachera", LocalDateTime.parse("2020-04-01T12:30")));
		tickets.add(new Ticket(true, "Dachera", LocalDateTime.parse("2020-04-01T12:30")));
		tickets.add(new Ticket(true, "Dachera", LocalDateTime.parse("2020-04-01T12:30")));
		tickets.add(new Ticket(true, "Dachera", LocalDateTime.parse("2020-04-01T14:00")));
		tickets.add(new Ticket(true, "Dachera", LocalDateTime.parse("2020-04-01T14:00")));
		tickets.add(new Ticket(true, "Dachera", LocalDateTime.parse("2020-04-01T14:00")));
		tickets.add(new Ticket(true, "Dachera", LocalDateTime.parse("2020-04-01T14:00")));
		tickets.add(new Ticket(true, "Dachera", LocalDateTime.parse("2020-04-01T14:00")));

	}
}
