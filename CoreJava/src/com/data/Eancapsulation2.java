package com.data;

import java.util.Scanner;

public class Eancapsulation2 {
	void meth1() {
		Eancapsulation aobj = new Eancapsulation();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter employee Id :");
		// aobj.empId=sc.nextInt();
		aobj.setEmpId(sc.nextInt());

		System.out.println("Enter employee Name :");
		// aobj.empName=sc.next();
		aobj.setEmpName(sc.next());

		System.out.println("Enter empSalary :");
		// aobj.empSalary=sc.nextDouble();
		aobj.setEmpSalary(sc.nextDouble());

		System.out.println("-------------------------------------------");
		// System.out.println("empId :"+aobj.empId);
		System.out.println("empId :" + aobj.getEmpId());

		// System.out.println("empName :"+aobj.empName);
		System.out.println("empName :" + aobj.getEmpName());

		// System.out.println("empSalary :"+aobj.empSalary);
		System.out.println("empSalary :" + aobj.getEmpSalary());
		sc.close();

	}

	public static void main(String[] args) {
		new Eancapsulation2().meth1();
	}

}
