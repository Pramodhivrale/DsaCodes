package com.proxy;

//Subject interface
interface Image {
 void display();
}

//RealObject
public class ProxyPattern implements Image {
 private String filename;

 public ProxyPattern(String filename) {
     this.filename = filename;
     loadFromDisk();
 }

 private void loadFromDisk() {
     // Load the image from disk
     System.out.println("Loading image from disk: " + filename);
 }

 @Override
 public void display() {
     System.out.println("Displaying image: " + filename);
 }
}

//Proxy
class ProxyImage implements Image {
 private ProxyPattern realImage;
 private String filename;

 public ProxyImage(String filename) {
     this.filename = filename;
 }

 @Override
 public void display() {
     if (realImage == null) {
         realImage = new ProxyPattern(filename);
     }
     realImage.display();
 }
}

//Client code
class Client {
 public static void main(String[] args) {
     Image image = new ProxyImage("image.jpg");
     image.display(); // Loads the image from disk and displays it
 }
}