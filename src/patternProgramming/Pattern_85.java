package patternProgramming;

// Eighty-fifthh Pattern Problem 
import java.util.Scanner;
public class Pattern_85 {

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
			// Print Spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("    ");
			}

			// Print Numbers
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.printf("%-4c", ch++);
			}
			System.out.println();
		}
	}
}

// Here is the Pattern : 
//				A   
//			B   C   D   
//		E   F   G   H   I   
//	J   K   L   M   N   O   P   
//Q   R   S   T   U   V   W   X   Y 