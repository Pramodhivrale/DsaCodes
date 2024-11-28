package com.data;

interface Engine {
	void engine();
}

class PetrolEngine implements Engine {
	@Override
	public void engine() {
		System.out.println("Petrol engine in works");
	}
}

class ElectricEngine implements Engine {
	@Override
	public void engine() {
		System.out.println("Electric engine in works");
	}
}

class EngineFactory {
	public static Engine createEngine(String type) {
		if (type.equalsIgnoreCase("Petrol")) {
			return new PetrolEngine();
		}
		if (type.equalsIgnoreCase("Electric")) {
			return new ElectricEngine();
		}
		throw new IllegalArgumentException("Invalid engine type: " + type);
	}
}

public class AAAA {

}
