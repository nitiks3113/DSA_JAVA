package patternProgramming;

import java.util.Scanner;
public class Pattern_126 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		char start = (char) (64 + n);
		for (int i = 1; i <= n; i++) {
			char ch = start;
			// Print Spaces
			for (int j = 1; j < i; j++) {
				System.out.print("    ");
			}

			// Print Characters
			for (int k = 1; k <= (2 * (n - i + 1) - 1); k++) {
				int mid = (2 * (n - i + 1) - 1) / 2 + 1;
				if (k < mid)
					System.out.printf("%-4c", ch--);
				else
					System.out.printf("%-4c", ch++);
			}
			start--;
			System.out.println();
		}
	}
}

// Here is the Pattern : 
//E   D   C   B   A   B   C   D   E   
//	D   C   B   A   B   C   D   
//    	C   B   A   B   C   
//        	B   A   B   
//            	A 