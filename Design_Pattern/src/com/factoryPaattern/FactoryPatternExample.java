package com.factoryPaattern;

public class FactoryPatternExample {
	
	public static void main(String[] args) {
		
		Factory f=new Factory();
		Notification n = f.createNotification("SMS");
		n.notifi();
		
		Notification n1 = f.createNotification("Email");
		n1.notifi();
		
		
		
	}

}

interface Notification{
	
	public void notifi();
}

class SmsNotification implements Notification{

	@Override
	public void notifi() {
		System.out.println("Sms Notification triggered");
		
	}
	
	
}

class EmailNotification implements Notification{

	@Override
	public void notifi() {
		
		System.out.println("Email notification triggered");
	}
	
}

class Factory{
	public Notification createNotification(String mode) {
		if(mode.equalsIgnoreCase("SMS")) {
			Notification n1=new SmsNotification();
			return n1;
		}
		if(mode.equalsIgnoreCase("Email")) {
			Notification n2=new EmailNotification();
			return n2;
		}
		return null;
		
	}
}















