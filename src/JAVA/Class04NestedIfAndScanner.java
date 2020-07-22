package JAVA;

import java.util.Scanner;

public class Class04NestedIfAndScanner {

	public static void main(String[] args) {
		
		int grade=50;
		Scanner input = new Scanner (System.in);
		System.out.println("Enter your num");
		int num =input.nextInt();
		if (num>=grade) {
			System.out.println("your passed");
		}else {
			System.out.println("your faild");
		}
	}
	
}
