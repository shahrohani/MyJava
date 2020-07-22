package JAVA;

public class Class102DArrays {

	public static void main(String[] args) {
		// 2D Arrays
		String[][]str= {
				{"ali","fareed","jalal"},
				{"tom","bob","adela"},
				{"tusho","sakila","logon"}
		};// using nested for when we print all the name 
		for(int r=0;r<str.length;r++) {
			for(int c=0;c<str[r].length;c++) {
				System.out.println(str[r][c]);
			}
			
		}
//System.out.println(str[1][2]);
	}

}
