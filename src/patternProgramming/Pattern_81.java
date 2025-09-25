package patternProgramming;

// Eighty-first Pattern Problem 
import java.util.Scanner;
public class Pattern_81 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int start = 1;
		for (int i = 1; i <= n; i++) {
			int num = start;
			// Print Spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}

			// Print Numbers
			for (int k = 1; k <= 2 * i - 1; k++) {
				int mid = (2 * i - 1) / 2 + 1;
				if (k < mid) {
					System.out.print(num++ + " ");
				} else {
					System.out.print(num-- + " ");
				}
			}
			start++;
			System.out.println();
		}
	}
}

// Here is the Pattern : 
//        1 
//      2 3 2 
//    3 4 5 4 3 
//  4 5 6 7 6 5 4 
//5 6 7 8 9 8 7 6 5