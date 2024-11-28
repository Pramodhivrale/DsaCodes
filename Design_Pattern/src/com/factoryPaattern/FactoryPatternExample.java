package com.factoryPaattern;

public class FactoryPatternExample {

	public static void main(String[] args) {

		Factory f = new Factory();
		Notification n = f.createNotification("SMS");
		n.notifi();

		Notification n1 = f.createNotification("Email");
		n1.notifi();

		Notification n2 = f.createNotification("POP");
		n2.notifi();

	}

}

interface Notification {

	public void notifi();
}

class SmsNotification implements Notification {

	@Override
	public void notifi() {
		System.out.println("Sms Notification triggered");

	}

}

class EmailNotification implements Notification {

	@Override
	public void notifi() {

		System.out.println("Email notification triggered");
	}

}

class PopNotification implements Notification {

	@Override
	public void notifi() {
		System.out.println("POP Notification ");
	}

}

class Factory {
	public Notification createNotification(String mode) {
		if (mode.equalsIgnoreCase("SMS")) {
			Notification n = new SmsNotification();
			return n;
		}
		if (mode.equalsIgnoreCase("Email")) {
			Notification n = new EmailNotification();
			return n;
		}
		if (mode.equals("POP")) {
			Notification n = new PopNotification();
			return n;
		}
		return null;

	}
}
