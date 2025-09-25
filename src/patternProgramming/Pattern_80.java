package patternProgramming;

// Eightieth Pattern Problem 
import java.util.Scanner;
public class Pattern_80 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int start = 0;
		for (int i = 1; i <= n; i++) {
			int num = start;
			// Print Spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}

			// Print Numbers
			for (int k = 1; k <= (2 * i - 1); k++) {
				int mid = (2 * i - 1) / 2 + 1;
				if (k < mid) {
					System.out.print(num-- + " ");
				} else {
					System.out.print(num++ + " ");
				}
			}
			start++;
			System.out.println();
		}
	}

}

// Here is the Pattern : 
//        0 
//      1 0 1 
//    2 1 0 1 2 
//  3 2 1 0 1 2 3 
//4 3 2 1 0 1 2 3 4 