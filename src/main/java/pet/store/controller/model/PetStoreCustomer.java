package pet.store.controller.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import pet.store.entity.Customer;

@Data
@NoArgsConstructor
public class PetStoreCustomer {

	public PetStoreCustomer(Customer customer) {

	}

	private Long customerId;
	private String customerFirstName;
	private String customerLastName;
	private String customerEmail;
}