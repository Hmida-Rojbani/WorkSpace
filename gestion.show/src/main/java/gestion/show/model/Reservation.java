package gestion.show.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Reservation {

	private LocalDateTime reservationDdate;
	private Customer customer;
}
