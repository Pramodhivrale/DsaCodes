package com.practice;

abstract class User {
	String name;
	String password;

	public User(String name, String password) {
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void login() {
		System.out.println(name + " has loged in");
		postloginaction();
	}

	protected abstract void postloginaction();

}

class Customer extends User {
	public Customer(String name, String password) {
		super(name, password);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void postloginaction() {
		System.out.println(name + " User logged in");
	}

}

class Admin extends User {

	public Admin(String name, String password) {
		super(name, password);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void postloginaction() {
		System.out.println(name + " User logged in");
	}

}

public class Main {
	public static void main(String[] args) {
		User customer = new Customer("Pramod", "15455");
		User admin = new Admin("Rutika", "kanskfd");
		customer.postloginaction();
		admin.postloginaction();
	}
}
