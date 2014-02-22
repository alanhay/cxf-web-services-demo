package uk.co.certait.ws.domain;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private Long id;
	private List<OrderLine> lines;

	public Order() {
		lines = new ArrayList<OrderLine>();
	}

	public Order(long id) {
		super();

		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<OrderLine> getLines() {
		return lines;
	}

	public void addLine(OrderLine line) {
		lines.add(line);
	}
}
