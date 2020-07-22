package JAVA;

import java.util.Scanner;

public class Class06SwitchCase {
// switch case  executes one statement from multiple conditions 
	// it works with byte short char int and string
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("enter number of the week");
		int weekday = input.nextInt();

		switch (weekday) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuseday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("Thrusday");

		

		}
	}
}
