package com.strategyPattern;

public class StretagyDesignPattern {

	public static void main(String[] args) {

		Customers c1 = new Customers(new RegularCustomer());
		c1.interserRate();

		Customers c2 = new Customers(new PreferredCustomer());
		c2.interserRate();
	}

}

interface CustomerType {

	void intersetrate();
}

class RegularCustomer implements CustomerType {

	@Override
	public void intersetrate() {

		System.out.println("Regular customer interset rate is 9.4%");
	}

}

class PreferredCustomer implements CustomerType {

	@Override
	public void intersetrate() {
		System.out.println("Preferred customer interset rate is 9.6%");

	}

}

class Customers {
	CustomerType c;

	public Customers(CustomerType c) {
		this.c = c;
	}

	public void interserRate() {
		c.intersetrate();
	}
}