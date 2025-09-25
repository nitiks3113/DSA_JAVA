package patternProgramming;

// Eighty-second Pattern Problem 
import java.util.Scanner;
public class Pattern_82 {

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
				System.out.print("   ");
			}

			// Print numbers
			for (int k = 1; k <= 2 * i - 1; k++) {
				int mid = (2 * i - 1) / 2 + 1;
				if (k < mid) {
					System.out.printf("%-3d", start++);
				} else {
					System.out.printf("%-3d", start--);
				}
			}
			start = start + i + 1;
			System.out.println();
		}
	}

}

// Here is the Pattern : 
//            1  
//         2  3  2  
//      4  5  6  5  4  
//   7  8  9  10 9  8  7  
//11 12 13 14 15 14 13 12 11 