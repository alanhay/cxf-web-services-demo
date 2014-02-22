package uk.co.certait.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import uk.co.certait.ws.domain.Customer;
import uk.co.certait.ws.domain.Order;
import uk.co.certait.ws.domain.OrderLine;

@WebService(endpointInterface = "uk.co.certait.ws.service.CustomerService")
public class CustomerServiceImpl implements CustomerService {

	@Override
	@WebMethod
	public Customer getCustomer(long customerId) {

		Customer customer = new Customer(1, "Alan", "Hay");
		Order order = new Order(1);
		order.addLine(new OrderLine("abc1", 12));
		order.addLine(new OrderLine("def1", 23));
		customer.addOrder(order);

		return customer;
	}
}
