package com.prototypePattern;

interface Prototype extends Cloneable {

	Prototype clone();
}

class Shape implements Prototype {

	private String type;

	public Shape(String type) {
		this.type = type;
	}

	public Prototype clone() {
		try {
			return (Prototype) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public String toString() {
		return "Shape [type=" + type + "]";
	}

}

public class PrototypeDesignPattern {

	public static void main(String[] args) {

		Shape originalShape = new Shape("Circle");

		Shape clone = (Shape) originalShape.clone();

		System.out.println(originalShape);

		System.err.println(clone);
	}
}
