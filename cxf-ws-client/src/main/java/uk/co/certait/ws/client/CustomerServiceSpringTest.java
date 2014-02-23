package uk.co.certait.ws.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import uk.co.certait.Customer;
import uk.co.certait.CustomerService;

public class CustomerServiceSpringTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		CustomerService service = context.getBean(CustomerService.class);

		Customer customer = service.getCustomer(1);

		System.out.println(customer.getForename());
		System.out.println(customer.getSurname());
		
		System.exit(0);
	}
}
