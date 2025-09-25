package patternProgramming;

// Eighty-fourth Pattern Problem 
import java.util.Scanner;
public class Pattern_84 {

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
			// Print Spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("    ");
			}

			// Print Numbers
			for (int k = 1; k <= 2 * i - 1; k++) {
				int mid = (2 * i - 1) / 2 + 1;
				if (k < mid) {
					System.out.printf("%-4d", start++);
				} else if (k == mid) {
					System.out.printf("%-4d", 1);
				} else {
					System.out.printf("%-4d", start++);
				}
			}
			System.out.println();
		}
	}

}

// Here is the Pattern : 
//				1   
//			1   1   2   
//		3   4   1   5   6   
//	7   8   9   1   10  11  12  
//13  14  15  16  1   17  18  19  20  