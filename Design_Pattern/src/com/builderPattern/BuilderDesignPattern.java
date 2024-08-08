package com.builderPattern;

public class BuilderDesignPattern {
	
	public BuilderDesignPattern(Userbuilder ub) {
		this.firstname=ub.firstname;
		this.lastname=ub.lastname;
		this.age=ub.age;
		this.mobile=ub.mobile;
	}
	
	private String firstname;
	private String lastname;
	private int age;
	private long mobile;

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public int getAge() {
		return age;
	}

	public long getMobile() {
		return mobile;
	}
	
	

	@Override
	public String toString() {
		return "BuilderDesignPattern [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", mobile="
				+ mobile + "]";
	}



	static class Userbuilder {

		private String firstname;
		private String lastname;
		private int age;
		private long mobile;

		public Userbuilder(String firstname, String lastname) {
			this.firstname = firstname;
			this.lastname = lastname;
		}

		public Userbuilder age(int age) {
			this.age = age;
			return this;

		}

		public Userbuilder mobile(long mobile) {
			this.mobile = mobile;
			return this;

		}
		public BuilderDesignPattern build() {
			BuilderDesignPattern bd=new BuilderDesignPattern(this);
			return bd;
			
		}
		public static void main(String[] args) {
			BuilderDesignPattern bd=new BuilderDesignPattern.Userbuilder("Pramod", "hivrale").age(10).mobile(15896548).build();
			System.out.println(bd);
			
			BuilderDesignPattern bd2=new BuilderDesignPattern.Userbuilder("Mahwsh", "Tamsekar").build();
			System.out.println(bd2);
		}
		
		

	}

}
