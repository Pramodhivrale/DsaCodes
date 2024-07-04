package com.java8;

public class ObjectsForSorting implements Comparable<ObjectsForSorting>
{
	int userId;
	String userName;
	String UserDept;
	
	
	public ObjectsForSorting(int userId, String userName, String userDept) {
		super();
		this.userId = userId;
		this.userName = userName;
		UserDept = userDept;
	}


	@Override
	public String toString() {
		return "ObjectsForSorting [userId=" + userId + ", userName=" + userName + ", UserDept=" + UserDept + "]";
	}


	@Override
	public int compareTo(ObjectsForSorting o) 
	{
		
		//return this.userId-o.userId;//Sorting data based on userId;
		return this.userName.compareTo(o.userName);//Comparing based on userName
		
	}
	
	
	
	

}
