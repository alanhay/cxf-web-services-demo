package uk.co.certait.ws.domain;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private long id;
	private String forename;
	private String surname;
	private List<Order> orders;

	public Customer() {
		orders = new ArrayList<Order>();
	}

	public Customer(long id, String forename, String surname) {
		super();

		this.id = id;
		this.forename = forename;
		this.surname = surname;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void addOrder(Order order) {
		orders.add(order);
	}
}
