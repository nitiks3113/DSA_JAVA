package patternProgramming;

import java.util.Scanner;
public class Pattern_107 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		for (int i = 1; i <= n; i++) {
			// Print Pattern
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}

			// Print Stars
			for (int k = 1; k <= 2 * (n - i + 1) - 1; k++) {
				System.out.printf("%-2s", "*");
			}
			System.out.println();
		}
	}
}

// Here is the Pattern : 
//* * * * * * * * * 
//  * * * * * * * 
//    * * * * * 
//      * * * 
//        *