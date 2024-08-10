package com.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class ObserverPattern 
{
	public static void main(String[] args) {
		Reciver kartika=new Reciver("kartik");
		Reciver babu=new Reciver("babu");
		Reciver rajesh=new Reciver("rajesh");
		Reciver harish=new Reciver("harish");
		Reciver pramod=new Reciver("pramod");
		Reciver kj=new Reciver("kj");
		
		InsurenacceCompany LIC=new InsurenacceCompany("LIC");
		InsurenacceCompany TATA=new InsurenacceCompany("TATA");
		
		LIC.addSub(kartika);
		LIC.addSub(babu);
		
		TATA.addSub(kj);
		
		LIC.tweet("Hi new policy added !");
		TATA.tweet("New tata policy added !");
	
	}

}

interface Customer{
	void notification(String tweet);
}

class Reciver implements Customer{
     String name;
	public Reciver(String name) {
		this.name=name;
	}
	
	@Override
	public void notification(String tweet) {
		System.out.println(name + " Notification recived "+ tweet);
		
	}
	
}

interface ManageSubAndNotify{
	
	public void addSub(Customer c);
	
	public void removeSub(Customer c);
	
	public void notifySub(String tweet);
	
}

class InsurenacceCompany implements ManageSubAndNotify
{
	String name;
	public InsurenacceCompany(String name) {
		this.name=name;
	}
	
	List<Customer> sublist=new ArrayList<>();

	@Override
	public void addSub(Customer c) {
		// TODO Auto-generated method stub
		sublist.add(c);
		
	}

	@Override
	public void removeSub(Customer c) {
		sublist.remove(c);
		
	}

	@Override
	public void notifySub(String tweet) {
		sublist.forEach(f -> f.notification(tweet));
	}
	
	public void tweet(String tweet) {
		notifySub(tweet);
	}
	
	
}

