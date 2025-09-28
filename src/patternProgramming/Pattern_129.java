package patternProgramming;

import java.util.Scanner;
public class Pattern_129 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printUpperPart(n);
		printLowerPart(n);
	}

	public static void printUpperPart(int n) {
		int m = n / 2 + 1;
		for (int i = 1; i <= m; i++) {
			// Print Spaces
			for (int k = 1; k <= m - i; k++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void printLowerPart(int n) {
		int m = n / 2;
		int start = m;
		for (int i = 1; i <= m; i++) {
			// Print Spaces
			for (int k = 1; k <= i; k++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= start; j++) {
				System.out.print("* ");
			}
			start--;
			System.out.println();
		}
	}
}

// Here is the Pattern : 
//		  * 
//		* * 
//	  * * * 
//	* * * * 
//* * * * * 
//	* * * * 
//	  * * * 
//		* * 
//		  * 