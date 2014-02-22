package uk.co.certait.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import uk.co.certait.ws.domain.Customer;

/**
 * name: wsdl:portType 
 * serviceName = wsdl:service 
 * portName = wsdl:port
 * 
 * @author alanhay
 * 
 */
@WebService(/*name = "customerService", serviceName = "getCustomer", portName = "getCustomerPort",*/ targetNamespace = "http://certait.co.uk", wsdlLocation = "http://localhost:8080/ws/customerService?wsdl")
public interface CustomerService {

	@WebMethod
	public Customer getCustomer(long customerId);
}
