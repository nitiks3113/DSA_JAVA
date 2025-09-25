package patternProgramming;

// Seventy-seventh Pattern Problem
import java.util.Scanner;
public class Pattern_77 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		for (int i = 1; i <= n; i++) {
			int start = n;
			// Print Space
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}

			// Print Numbers
			for (int k = 1; k <= 2 * i - 1; k++) {
				int mid = (2 * i - 1) / 2 + 1;
				if (k < mid) {
					System.out.print(start-- + " ");
				} else {
					System.out.print(start++ + " ");
				}
			}
			System.out.println();
		}
	}
}

// Here is the Pattern : 
//        5 
//      5 4 5 
//    5 4 3 4 5 
//  5 4 3 2 3 4 5 
//5 4 3 2 1 2 3 4 5 