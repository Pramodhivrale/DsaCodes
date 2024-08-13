package com.abstractFactroy;

public class AbstractFactory {
	public static void main(String[] args) {

	}

}

interface ProductFactory {
	void createproduct();
}

interface Product {
	public void info();

	public void price();
}

class Mobile implements Product {

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("Mobile Phone");

	}

	@Override
	public void price() {
		System.out.println("Price mobile phone is 26000");

	}

}

class Television implements Product {

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("Television ");

	}

	@Override
	public void price() {
		System.out.println("Price Television phone is 26000");

	}

}

class Electronics implements ProductFactory {

	@Override
	public void createproduct() {
		// TODO Auto-generated method stub

	}

}
