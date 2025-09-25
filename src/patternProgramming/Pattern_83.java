package patternProgramming;

// Eighty-third Pattern Problem 
import java.util.Scanner;
public class Pattern_83 {

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
				} else if (k == mid) {
					System.out.printf("%-3d", 0);
				} else {
					System.out.printf("%-3d", start++);
				}
			}
			start += 2;
			System.out.println();
		}
	}

}

// Here is the Pattern : 
//            0  
//         3  0  4  
//      7  8  0  9  10 
//   13 14 15 0  16 17 18 
//21 22 23 24 0  25 26 27 28