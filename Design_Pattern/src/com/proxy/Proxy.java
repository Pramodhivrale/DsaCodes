package com.proxy;

interface Display {
	void display();
}

class RealImage implements Display {

	String filename;

	public RealImage(String filename) {
		this.filename = filename;
		loadFormDb();
	}

	private void loadFormDb() {

		System.out.println("Loading image from DB :" + filename);
	}

	@Override
	public void display() {
		System.out.println("Displaying image form DB :" + filename);

	}

}

class ProxyImag implements Display {

	private RealImage realImage;
	private String filename;

	public ProxyImag(String filename) {
		this.filename = filename;

	}

	@Override
	public void display() {
		if(realImage == null) {
			realImage = new RealImage(filename);
		}
		realImage.display();

	}

}

public class Proxy {
	
	public static void main(String[] args) {
		Display d=new ProxyImag("Love.jpg");
		d.display();
	}

}
