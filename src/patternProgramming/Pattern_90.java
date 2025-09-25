package patternProgramming;

// Ninetieth Pattern Problem 
import java.util.Scanner;
public class Pattern_90 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int start = 65;
		for (int i = 1; i <= n; i++) {
			char ch = (char) (start);
			// Print Spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("    ");
			}

			// Print Characters
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.printf("%-4c", ch--);
			}
			start += 2;
			System.out.println();
		}
	}

}

// Here is the Pattern : 
//				A   
//			C   B   A   
//		E   D   C   B   A   
//	G   F   E   D   C   B   A   
//I   H   G   F   E   D   C   B   A