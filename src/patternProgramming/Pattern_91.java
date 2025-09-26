package patternProgramming;

// Ninety-first Pattern Problem 
import java.util.Scanner;
public class Pattern_91 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		for (int i = 1; i <= n; i++) {
			char ch = 'A';
			// Print Spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("    ");
			}

			// Print Characters
			for (int k = 1; k <= 2 * i - 1; k++) {
				int mid = (2 * i - 1) / 2 + 1;
				if (k < mid)
					System.out.printf("%-4c", ch++);
				else
					System.out.printf("%-4c", ch--);
			}
			System.out.println();
		}
	}
}

// Here is the Pattern : 
//				A   
//			A   B   A   
//		A   B   C   B   A   
//	A   B   C   D   C   B   A   
//A   B   C   D   E   D   C   B   A 