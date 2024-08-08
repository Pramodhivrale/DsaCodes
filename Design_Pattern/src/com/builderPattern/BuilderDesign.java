package com.builderPattern;

public class BuilderDesign {
	private String name;
	private String lastname;
	private int age;
	private long mobileNo;

	public BuilderDesign(Builder b) {
		this.name = b.name;
		this.lastname = b.lastname;
		this.age = b.age;
		this.mobileNo = b.mobileNo;
	}

	public String getName() {
		return name;
	}

	public String getLastname() {
		return lastname;
	}

	public int getAge() {
		return age;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	@Override
	public String toString() {
		return "BuilderDesign [name=" + name + ", lastname=" + lastname + ", age=" + age + ", mobileNo=" + mobileNo
				+ "]";
	}

	static class Builder {

		private String name;
		private String lastname;
		private int age;
		private long mobileNo;

		public Builder(String name, String lastname) {
			this.name = name;
			this.lastname = lastname;
		}

		public Builder age(int age) {
			this.age = age;
			return this;
		}

		public Builder mobileNo(long mobile) {
			this.mobileNo = mobile;
			return this;
		}

		public BuilderDesign build() {
			BuilderDesign b1 = new BuilderDesign(this);
			return b1;

		}

		public static void main(String[] args) {
			BuilderDesign b1 = new BuilderDesign.Builder("pramod", "hivrale").age(19).mobileNo(7066062).build();
			System.out.println(b1);

			BuilderDesign b2 = new BuilderDesign.Builder("Rutika", "Barhatee").age(24).build();

			System.out.println(b2);

			BuilderDesign b3 = new BuilderDesign.Builder("gnhesh", "Sawant").mobileNo(8569).build();
			System.out.println(b3);
		}
	}

}
