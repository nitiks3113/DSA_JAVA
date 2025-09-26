package patternProgramming;

// Ninety-sixth Pattern Problem 
import java.util.Scanner;
public class Pattern_96 {

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
				System.out.print(" ");
			}

			// Print Numbers
			for (int k = 1; k <= n - i + 1; k++) {
				if (i % 2 == 0) {
					System.out.print("0 ");
				} else {
					System.out.print("1 ");
				}
			}
			System.out.println();
		}
	}
}

// Here is the Pattern : 
//1 1 1 1 1 
// 0 0 0 0 
//  1 1 1 
//   0 0 
//    1 