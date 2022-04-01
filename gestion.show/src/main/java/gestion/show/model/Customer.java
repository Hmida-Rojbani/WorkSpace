package gestion.show.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString(of = "name")
@NoArgsConstructor
public class Customer {
	
	private String name;
	private String phone;
	private List<Reservation> reservations = new ArrayList<>();
	
	public Customer(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	
}
