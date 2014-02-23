package uk.co.certait.ws.client;

import uk.co.certait.Customer;
import uk.co.certait.CustomerServiceService;

public class CustomerServiceTest {

	public static void main(String [] args){
		CustomerServiceService service = new CustomerServiceService();
		Customer customer = service.getCustomerServicePort().getCustomer(1);
		
		System.out.println(customer.getForename());
		System.out.println(customer.getSurname());
		
		System.exit(0); 
	}
}
