package uk.co.certait.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import uk.co.certait.ws.domain.Customer;

@WebService
public interface CustomerService {

	@WebMethod
	public Customer getCustomer(long customerId);
}
