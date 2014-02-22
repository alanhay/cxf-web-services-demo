package uk.co.certait.ws.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "order")
public class Order implements Serializable{

	private Long id;
	private List<OrderLine> lines;

	public Order() {
		lines = new ArrayList<OrderLine>();
	}

	public Order(long id) {
		this();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@XmlElementWrapper(name="orderLines")
	@XmlElement(name="orderLine")
	public List<OrderLine> getLines() {
		return lines;
	}

	public void setLines(List<OrderLine> lines) {
		this.lines = lines;
	}

	public void addLine(OrderLine line) {
		lines.add(line);
	}
}
