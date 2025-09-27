package patternProgramming;

import java.util.Scanner;
public class Pattern_125 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		char start = (char) (64 + (2 * n) - 1);
		for (int i = 1; i <= n; i++) {
			char ch = start;
			// Print Characters
			for (int j = 1; j < i; j++) {
				System.out.print("    ");
			}

			// Print Characters
			for (int k = 1; k <= (2 * (n - i + 1) - 1); k++) {
				System.out.printf("%-4c", ch--);
			}
			start -= 2;
			System.out.println();
		}
	}
}

// Here is the Pattern : 
//I   H   G   F   E   D   C   B   A   
//	G   F   E   D   C   B   A   
//    	E   D   C   B   A   
//        	C   B   A   
//            	A   
