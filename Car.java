package com.packages.demo;

public class Car {
	private String id;
	private String name;
	private String maker;
	private int seats;
	private int year;
	
	
	public Car() {
		
	}
	
	public Car(String id, String name, String maker, int seats, int year) {
		this.id = id;
		this.name = name;
		this.maker = maker;
		this.seats = seats;
		this.year = year;
	}
	
	// setters and getters
	
	@Override
	public String toString() {
		return "ID: " + id + "\nName: " + name + "\nMaker: " + maker
				+ "\nSeats: " + seats + "\nReleased Year: " + year;
	}
}