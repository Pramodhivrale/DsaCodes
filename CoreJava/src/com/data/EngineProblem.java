package com.data;

interface Enginee {
	void engine();
}

class PetrolEnginee implements Enginee {
	@Override
	public void engine() {
		System.out.println("Petrol engine in works");
	}
}

class ElectricEngine implements Enginee {
	@Override
	public void engine() {
		System.out.println("Electric engine in works");
	}
}

class EngineFactory {
	public static Enginee createEngine(String type) {
		if (type.equalsIgnoreCase("Petrol")) {
			return new PetrolEnginee();
		}
		if (type.equalsIgnoreCase("Electric")) {
			return new ElectricEngine();
		}
		throw new IllegalArgumentException("Invalid engine type: " + type);
	}
}

public class EngineProblem {

}
