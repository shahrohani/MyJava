package JAVA;

public class Class09Array {

	public static void main(String[] args) {
		// Arrays
		int[] arrays;
		arrays = new int[3];
		arrays[0] = 10;
		arrays[1] = 20;
		arrays[2] = 30;
		System.out.println(arrays.length);
		String[] str;
		str = new String[3];
		str[0] = "ali";
		str[1] = "tom";
		str[2] = "khan";
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);

			System.out.println(str[0]);
		}
		int[] num = { 20, 30, 40 };
		System.out.println(num[0]);
		
	
for (String name:str) {
	System.out.println(name);
}
}
}