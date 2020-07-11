package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	
	private List<OrderItem> items = new ArrayList<OrderItem>(); 
	
	
	public Order() {}


	public Order(Date moment, OrderStatus status, Client client) {
		super();
		this.moment = moment;
		this.status = status;
		this.client = client;
	}


	public Date getMoment() {
		return moment;
	}


	public void setMoment(Date moment) {
		this.moment = moment;
	}


	public OrderStatus getStatus() {
		return status;
	}


	public void setStatus(OrderStatus status) {
		this.status = status;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}

	public void addItem(OrderItem item) {
		this.items.add(item);
	}

	public void removeItem(OrderItem item) {
		this.items.remove(item);
	}
	
	public Double total() {
		Double total = 0.0;
		for (OrderItem it: items) {
			total += it.subTotal();
		}
		return total;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment:");
		sb.append(sdf.format(this.moment) + "\n");
		sb.append("Order Status:");
		sb.append(this.status + "\n");
		sb.append("Client:");
		sb.append(this.client + "\n");
		sb.append("Order items: \n");
		for (OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", this.total()));
		
		return sb.toString();
	}
	
	
}
