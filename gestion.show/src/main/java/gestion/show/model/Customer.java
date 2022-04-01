package gestion.show.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString(of = "name")
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	
	private String name;
	private String phone;

}
