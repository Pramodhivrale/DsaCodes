package com.composite;

public class MainClass {

	public static void main(String[] args) {

		CompositeDesignPattern hod = new CompositeDesignPattern("nilesh", 123, 25000.00, "ECE");

		CompositeDesignPattern prof1 = new CompositeDesignPattern("mahesh", 124, 30000.00, "ECE");
		CompositeDesignPattern prof2 = new CompositeDesignPattern("savan", 125, 45000.00, "ECE");

		CompositeDesignPattern assist1 = new CompositeDesignPattern("divay", 124, 20000.00, "ECE");
		CompositeDesignPattern assist2 = new CompositeDesignPattern("rutika", 128, 45000.00, "ECE");
		CompositeDesignPattern assist3 = new CompositeDesignPattern("sanavi", 124, 30000.00, "ECE");

		hod.add(prof1);
		hod.add(prof2);
		
		prof1.add(assist1);
		prof1.add(assist2);
		prof1.add(assist3);
		
		hod.printAll();

	}

}
