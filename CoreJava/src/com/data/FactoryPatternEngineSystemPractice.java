package com.data;

interface Engineee {
	void engine();
}

class PetrolEngineee implements Engineee {

	@Override
	public void engine() {
		System.out.println("Petrol Engine");
	}

}

class ElectricEngineeee implements Engineee {
	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("Electric engine");
	}
}

class DesialEngineee implements Engineee {
	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("Diseal engine");
	}
}

class FactoryOfEngine {

	public static Engineee getEng(String type) {
		switch (type.toLowerCase()) {
		case "petrol": {
			return new PetrolEngineee();
		}
		case "electric":
			return new ElectricEngineeee();
		case "diesel":
			return new DesialEngineee();
		default:
			throw new IllegalArgumentException("Invalid engine type: " + type);
		}
	}
}

class Cars {
	private Engineee eg;

	public Cars(Engineee eg) {
		this.eg = eg;
	}

	public void start() {
		eg.engine();
	}
}

public class FactoryPatternEngineSystemPractice {
	public static void main(String[] args) {
		Engineee eng = FactoryOfEngine.getEng("Petrol");
		Cars c=new Cars(eng);
		c.start();
	}
}
