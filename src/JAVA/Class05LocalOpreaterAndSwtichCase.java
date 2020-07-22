package JAVA;

public class Class05LocalOpreaterAndSwtichCase {

	public static void main(String[] args) {
		// And && OR || not !

		int num1 = 30;
		int num2 = 60;
		int num3 = 100;
		if ((num1 > num2) && (num1 >= num3)) {
			System.out.println("num1 is the largest number");
		} else if ((num2 > num1) && (num2 >= num3)) {
			System.out.println("num2 is the largest number");

		} else if ((num3 > num1) && (num3 >= num2)) {
			System.out.println("num3 is the largest number");
		}

	}
}