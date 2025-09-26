package patternProgramming;

// Ninety-second Pattern Problem 
import java.util.Scanner;
public class Pattern_92 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		char ch = 'A';
		for (int i = 1; i <= n; i++) {
			char start = ch;
			// Print Spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("    ");
			}

			// Print Characters
			for (int k = 1; k <= 2 * i - 1; k++) {
				int mid = (2 * i - 1) / 2 + 1;
				if (k < mid)
					System.out.printf("%-4c", start++);
				else
					System.out.printf("%-4c", start--);
			}
			ch++;
			System.out.println();
		}
	}
}

// Here is the Pattern : 
//				A   
//			B   C   B   
//		C   D   E   D   C   
//	D   E   F   G   F   E   D   
//E   F   G   H   I   H   G   F   E