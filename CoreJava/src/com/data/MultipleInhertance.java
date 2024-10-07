package com.data;

public class MultipleInhertance implements MultipleInhertance1,MultipleInhertance2
{
	public static void main(String[] args) {
		new MultipleInhertance().meth1();
	}

	@Override
	public void meth1() {
		MultipleInhertance1.super.meth1();
		MultipleInhertance2.super.meth1();
	}

	

}
