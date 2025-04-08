package com.tca.oop;

abstract class Staff {
	private String name;
	private String address;

	public Staff() {
	}

	public Staff(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public abstract void display();
}

class FTS extends Staff {
	private String dept;
	private double salary;

	public FTS() {
	}

	public FTS(String name, String address, String dept, double salary) {
		super(name, address);
		this.dept = dept;
		this.salary = salary;
	}

	public void display() {
		System.out.println(super.getName() + "-" + super.getAddress() + "-" + dept + "-" + salary);
	}
}

class PTS extends Staff {
	private int noOfHr;
	private int ratePerHr;

	public PTS() {
	}

	public PTS(String name, String address, int noOfHr, int ratePerHr) {
		super(name, address);
		this.noOfHr = noOfHr;
		this.ratePerHr = ratePerHr;

	}

	public void display() {
		System.out.println(super.getName() + "-" + super.getAddress() + "-" + noOfHr + "-" + ratePerHr);

	}

}

public class ASS01_Abstraction {

	public static void main(String[] args) {

		/*
		 * FTS ob = new FTS("Saurav", "Pune", "CS", 10000); ob.display();
		 * 
		 * PTS ob1 = new PTS("Pratik", "Sangvi", 5, 100); ob1.display();
		 */

		Staff s = null;
		s = new FTS("Saurav", "Pune", "CS", 10000);
		s.display();

		s = new PTS("Pratik", "Sangvi", 5, 100);
		s.display();

	}

}
