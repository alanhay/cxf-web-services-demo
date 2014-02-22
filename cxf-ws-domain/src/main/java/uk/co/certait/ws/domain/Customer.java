package uk.co.certait.ws.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

public class Customer implements Serializable {

	private long id;
	private String forename;
	private String surname;
	private List<Order> orders;

	public Customer() {
		orders = new ArrayList<Order>();
	}

	public Customer(long id, String forename, String surname) {
		this();

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

	@XmlElementWrapper(name="orders")
	@XmlElement(name="order")
	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public void addOrder(Order order) {
		orders.add(order);
	}
}
