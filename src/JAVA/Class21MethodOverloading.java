package JAVA;

public class Class21MethodOverloading {

	void khan () {
		System.out.println("i m not method overloading");
	}
	
	void khan (String str) {
		System.out.println("i m overloading method");
	}
	public static void main(String []args) {
		Class21MethodOverloading obj = new Class21MethodOverloading();
		obj.khan();
		obj.khan("");
		
	}
}
