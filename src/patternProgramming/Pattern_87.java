package patternProgramming;

import java.util.Scanner;

// Eighty-seventh Pattern
public class Pattern_87 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		char ch = 'A';
		for (int i = 1; i <= n; i++) {
			// Print Spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("    ");
			}

			// Print Characters
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.printf("%-4c", ch);
			}
			ch++;
			System.out.println();
		}
	}

}
// Here is the Pattern : 
//				A   
//			B   B   B   
//		C   C   C   C   C   
//	D   D   D   D   D   D   D   
//E   E   E   E   E   E   E   E   E 