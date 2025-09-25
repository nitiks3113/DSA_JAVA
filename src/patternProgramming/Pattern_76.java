package patternProgramming;

// Seventy-sixth Pattern Problem 
import java.util.Scanner;
public class Pattern_76 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int width = String.valueOf(n * (n + 1) / 2).length();
		for (int i = 1; i <= n; i++) {
			int start = 1;
			int mid = i;
			// Print Spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.printf("%" + 2 * width + "s", "");
			}

			// Print Numbers
			for (int k = 1; k <= 2 * i - 1; k++) {
				if (k < mid) {
					System.out.printf("%" + 2 * width + "d", start++);
				} else {
					System.out.printf("%" + 2 * width + "d", start--);
				}
			}
			System.out.println();
		}
	}

}

// Here is the Pattern : 
//				1
//			1   2   1
//		1   2   3   2   1
//	1   2   3   4   3   2   1
//1   2   3   4   5   4   3   2   1