package patternProgramming;

import java.util.Scanner;
public class Pattern_109 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		for (int i = 1; i <= n; i++) {
			// Print Spaces
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}

			// Print Number
			for (int k = 1; k <= (2 * (n - i + 1) - 1); k++) {
				if (i % 2 == 0) {
					System.out.printf("%-2d", 0);
				} else {
					System.out.printf("%-2d", 1);
				}
			}
			System.out.println();
		}
	}
}

// Here is the Pattern : 
//1 1 1 1 1 1 1 1 1 
//  0 0 0 0 0 0 0 
//    1 1 1 1 1 
//      0 0 0 
//        1