package com.data;

public final class ImmuatableClass {
	private final String name;
	private final int id;
	ImmuatableClassB adddr;

	public ImmuatableClass(String name, int id,ImmuatableClassB b) {
		ImmuatableClassB bv=new ImmuatableClassB(b.add);
		this.adddr=bv;
		
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public ImmuatableClassB getAdddr() {
		return adddr;
	}
	
	

}
