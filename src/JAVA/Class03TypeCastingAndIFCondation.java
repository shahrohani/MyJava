package JAVA;

public class Class03TypeCastingAndIFCondation {

	public static void main(String[] args) {
		// 2type of type casting in Java
		double d = 555.5;
		int i = (int) d;
		System.out.println(i);
		byte by = 15;
		float b = by;
		System.out.println(b);
		int num1 = 20;
		int num2 = 30;
		int num3 = 40;
		// two type of conditional statement in Java 1 if statement 2 switch
		if (num1 < num2) {
			System.out.println("num1 is smaller than num2");
		} else if (num1 == num2) {
			System.out.println("num1 is equal than num2");
		} else {
			System.out.println("num1 is greater than num2");
		}

	}

}
