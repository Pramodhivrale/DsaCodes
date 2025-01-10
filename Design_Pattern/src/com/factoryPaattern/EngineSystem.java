package com.factoryPaattern;


//Interface for Engine
interface Engine {
	void engine();
}

//Implementation for Petrol Engine
class PetrolEngine implements Engine {
	@Override
	public void engine() {
		System.out.println("Petrol engine in works");
	}
}

//Implementation for Electric Engine
class ElectricEngine implements Engine {
	@Override
	public void engine() {
		System.out.println("Electric engine in works");
	}
}

//Implementation for Diesel Engine (optional additional engine)
class DieselEngine implements Engine {
	@Override
	public void engine() {
		System.out.println("Diesel engine in works");
	}
}

//Factory to create Engine instances
class EngineFactory {
	public static Engine createEngine(String type) {
		switch (type.toLowerCase()) {
		case "petrol":
			return new PetrolEngine();
		case "electric":
			return new ElectricEngine();
		case "diesel":
			return new DieselEngine();
		default:
			throw new IllegalArgumentException("Invalid engine type: " + type);
		}
	}
}

//Car class
class Car {
	private Engine engine;

	public Car(Engine engine) {
		this.engine = engine;
	}

	public void start() {
		System.out.println("Car starting...");
		engine.engine();
	}
}

//Main class to test the implementation
public class EngineSystem {
	public static void main(String[] args) {
		// Create Petrol Engine and Car
		Engine petrolEngine = EngineFactory.createEngine("Petrol");
		Car petrolCar = new Car(petrolEngine);
		petrolCar.start();
		

		// Create Electric Engine and Car
		Engine electricEngine = EngineFactory.createEngine("Electric");
		Car electricCar = new Car(electricEngine);
		electricCar.start();

		// Create Diesel Engine and Car (optional)
		Engine dieselEngine = EngineFactory.createEngine("Diesel");
		Car dieselCar = new Car(dieselEngine);
		dieselCar.start();
	}
}
