package uk.co.certait.ws.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace="http://certait.co.uk")
public class OrderLine implements Serializable {

	private String productId;
	private int quantity;
	
	public OrderLine(){}

	public OrderLine(String productId, int quantity) {
		this.productId = productId;
		this.quantity = quantity;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
