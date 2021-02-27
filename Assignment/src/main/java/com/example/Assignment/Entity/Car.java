package com.example.Assignment.Entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "car")
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	@Column(name = "company")
	private String company;
	private String model;

	private String color;

	private double Price;

	@Column(name = "engine_capacity")
	private float engineCapacity;

	@Column(name = "licence_plate_number")
	private String licencePlateNumber;

	@Column(name = "seating_capacity")
	private int seatingCapacity;

	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dateOfpurchase;

	public Date getDateOfpurchase() {
		return dateOfpurchase;
	}

	public void setDateOfpurchase(Date dateOfpurchase) {
		this.dateOfpurchase = dateOfpurchase;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public float getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(float engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public String getLicencePlateNumber() {
		return licencePlateNumber;
	}

	public void setLicencePlateNumber(String licencePlateNumber) {
		this.licencePlateNumber = licencePlateNumber;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

}
