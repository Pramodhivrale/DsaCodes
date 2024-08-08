package com.decoreterPatterm;

public class DecoretorDesignPattern {
	public static void main(String[] args) {

		BasicPlans ajay = new AjayPlans();
		System.out.println(ajay.getPrimium());
		System.out.println(ajay.policyDetails());

		BasicPlans mahesh = new AjayPlans();
		System.out.println(mahesh.getPrimium());
		System.out.println(mahesh.policyDetails());

		ajay = new AccedintialBenifit(ajay);
		System.out.println(ajay.getPrimium());
		System.out.println(ajay.policyDetails());
		
		ajay=new CreticalBenifit(ajay);
		System.out.println(ajay.getPrimium());
		System.out.println(ajay.policyDetails());
		
//		mahesh=new AccedintialBenifit(mahesh);
//		System.out.println(mahesh.getPrimium());
//		System.out.println(mahesh.policyDetails());

//		BasicPlans mahesh2 = new AjayPlans();
//		System.out.println(mahesh2.getPrimium());
//		System.out.println(mahesh2.policyDetails());
		
		
	}

}

interface BasicPlans {

	public int getPrimium();

	public String policyDetails();
}

class AjayPlans implements BasicPlans {

	@Override
	public int getPrimium() {
		return 1566;
	}

	@Override
	public String policyDetails() {
		return "This is basic cover";
	}

}

abstract class PolicyDecorator implements BasicPlans {
	BasicPlans basicPlans;

	public PolicyDecorator(BasicPlans basicPlans) {
		this.basicPlans = basicPlans;
	}

	@Override
	public int getPrimium() {
		return basicPlans.getPrimium();
	}

	@Override
	public String policyDetails() {
		return basicPlans.policyDetails();
	}

}

class AccedintialBenifit extends PolicyDecorator {

	public AccedintialBenifit(BasicPlans basicPlans) {
		super(basicPlans);
	}

	@Override
	public int getPrimium() {
		return super.getPrimium() + 76;
	}

	@Override
	public String policyDetails() {
		return super.policyDetails() + " extra accendentl cover is provided";
	}

}

class CreticalBenifit extends PolicyDecorator {

	public CreticalBenifit(BasicPlans basicPlans) {
		super(basicPlans);
	}

	@Override
	public int getPrimium() {
		return super.getPrimium() + 650;
	}

	@Override
	public String policyDetails() {
		return super.policyDetails() + " extra Cretical cover is provided";
	}

}