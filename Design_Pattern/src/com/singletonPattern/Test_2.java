package com.singletonPattern;

public class Test_2 
{
	public static void main(String[] args) throws Exception {
		
		SingletonDesignPatter_2 s1= SingletonDesignPatter_2.getInstance();
		SingletonDesignPatter_2 s2= SingletonDesignPatter_2.getInstance();
		SingletonDesignPatter_2 s3= SingletonDesignPatter_2.getInstance();
		SingletonDesignPatter_2 s4= SingletonDesignPatter_2.getInstance();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
//		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\\\FileInputStrem\\\\pramod2.ser"));
//		oos.writeObject(s1);
//		
//		ObjectInputStream obj=new ObjectInputStream(new FileInputStream("C:\\\\FileInputStrem\\\\pramod2.ser"));
//		SingletonDesignPatter_2 s5 =(SingletonDesignPatter_2) obj.readObject();
//		System.out.println(s5.hashCode());
//		
//		Constructor<SingletonDesignPatter_2> declaredConstructor = SingletonDesignPatter_2.class.getDeclaredConstructor();
//		declaredConstructor.setAccessible(true);
//		SingletonDesignPatter_2 newInstance =(SingletonDesignPatter_2) declaredConstructor.newInstance();
//		System.out.println(newInstance.hashCode());
		
		SingletonDesignPatter_2 clone =(SingletonDesignPatter_2) s1.clone();
		System.out.println(clone.hashCode()); // broke singleton using clone
		
		
	}

}
