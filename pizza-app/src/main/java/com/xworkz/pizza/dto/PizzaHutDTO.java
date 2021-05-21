package com.xworkz.pizza.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pizza_table")
public class PizzaHutDTO implements java.io.Serializable {

	@Column(name = "PIZZA_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pizzaId;

	@Column(name = "NAME")
	private String name;

	@Column(name = "LOCATION")
	private String location;

	@Column(name = "PRICE")
	private double price;

	@Column(name = "IS_AVAILABLE")
	private boolean isAvailable;

	@Column(name = "SIZE")
	private String size;

	@Column(name = "TYPE")
	private String type;

	public PizzaHutDTO() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	public PizzaHutDTO(String name, String location, double price, boolean isAvailable, String size, String type) {
		super();
		this.name = name;
		this.location = location;
		this.price = price;
		this.isAvailable = isAvailable;
		this.size = size;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
