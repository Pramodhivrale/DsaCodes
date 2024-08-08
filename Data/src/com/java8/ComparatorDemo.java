package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class ComparatorDemo_1 implements Comparator<ComparatorDemo_1> {

	int userId;
	String userName;
	String UserDept;
	
	

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserDept() {
		return UserDept;
	}

	public void setUserDept(String userDept) {
		UserDept = userDept;
	}

	public ComparatorDemo_1(int userId, String userName, String userDept) {
		super();
		this.userId = userId;
		this.userName = userName;
		UserDept = userDept;
	}

	@Override
	public String toString() {
		return "ComparatorDemo_1 [userId=" + userId + ", userName=" + userName + ", UserDept=" + UserDept + "]";
	}

	@Override
	public int compare(ComparatorDemo_1 o1, ComparatorDemo_1 o2) {

		//return o1.getUserId()-o2.getUserId();
		return o1.getUserName().compareTo(o2.getUserName());
	}

}

public class ComparatorDemo {

	void meth1() {
		System.out.println("Sorting tha data based on Object");
		ArrayList<Object> al = new ArrayList<Object>();

		al.add(new ObjectsForSorting(4, "Pramod", "softwear engg"));
		al.add(new ObjectsForSorting(3, "Rutika", "Data engg"));
		al.add(new ObjectsForSorting(2, "Mahesh", "Business man"));
		al.add(new ObjectsForSorting(1, "Radha", "Doctoer"));

		Collections.sort(al,null);

		Iterator<Object> iterator = al.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public static void main(String[] args) {

		new ComparatorDemo().meth1();
	}

}
