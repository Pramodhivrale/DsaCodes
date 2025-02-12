package com.data;

interface Engine {
	public void engine();
}

class PetrolEngine implements Engine {

	@Override
	public void engine() {
		System.out.println("Petrol engine in works");
	}

}

class ElectricEngin implements Engine {

	@Override
	public void engine() {
		System.out.println("Electric engine in works");
	}

}

class Car {
	public Engine carEngine(String mode) {
		if (mode.equalsIgnoreCase("Petrol")) {
			Engine e1 = new PetrolEngine();
			return e1;
		}
		if (mode.equalsIgnoreCase("Electric")) {
			Engine e2 = new ElectricEngin();
			return e2;
		}
		return null;
	}
}

public class FactoryPatternEngineSystem {
	public static void main(String[] args) {
		Car c = new Car();
		Engine carEngine = c.carEngine("Petrol");
		carEngine.engine();
		
		Engine carEngine2 = c.carEngine("Electric");
		carEngine2.engine();
	}
}
