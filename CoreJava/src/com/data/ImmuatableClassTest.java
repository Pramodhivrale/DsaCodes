package com.data;

public class ImmuatableClassTest {
	public static void main(String[] args) {
		ImmuatableClassB b=new ImmuatableClassB("Rada");
		ImmuatableClass i = new ImmuatableClass("pramod", 456,b);
		
		
		int id = i.getId();
		System.out.println(id);
		
         b.add="aojf";
         System.out.println(i.getAdddr().add);

	}

}
