package patternProgramming;

import java.util.Scanner;
public class Pattern_102 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		for (int i = 1; i <= n; i++) {
			char ch = 'A';
			// Print Spaces
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}

			// Print Characters
			for (int k = 1; k <= n - i + 1; k++) {
				System.out.printf("%-4c", ch++);
			}
			System.out.println();
		}
	}
}

// Here is the Pattern : 
//A   B   C   D   E   
//  A   B   C   D   
//    A   B   C   
//      A   B   
//        A