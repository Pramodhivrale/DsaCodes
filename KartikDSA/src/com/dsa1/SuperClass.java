package com.dsa1;

public class SuperClass 
{
	public int doit(String str,Integer... data)throws Exception{
		String signature="(String,Integer[])";
		System.out.println(str +" "+signature);
		return 1;
	}
	public static void main(String[] args) {
		
	}

}
class Subclass extends SuperClass{
	public int doit(String str,Integer... data) {
		String signature="(String,Integer[])";
		System.out.println("Overridden:" + str + " " + signature);
		return 0;
	}
	public static void main(String[] args){
		SuperClass sb=new Subclass();
		try {
			sb.doit("hello", 3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		try {
//			sb.doit("hello", 3);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
