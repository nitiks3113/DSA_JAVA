package patternProgramming;

import java.util.Scanner;
public class Pattern_110 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		for (int i = 1; i <= n; i++) {
			int start = 1;
			// Print Spaces
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}

			// Print Number
			for (int k = 1; k <= (2 * (n - i + 1) - 1); k++) {
				System.out.printf("%-2d", start++);
			}
			System.out.println();
		}
	}
}

// Here is the Pattern : 
//1 2 3 4 5 6 7 8 9 
//  1 2 3 4 5 6 7 
//    1 2 3 4 5 
//      1 2 3 
//        1 