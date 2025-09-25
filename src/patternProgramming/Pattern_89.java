package patternProgramming;

// Eighty-nineth Pattern Problem 
import java.util.Scanner;
public class Pattern_89 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		char ch = (char) (64 + n);
		for (int i = 1; i <= n; i++) {
			// Print Spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("    ");
			}

			// Print Numbers
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.printf("%-4c", ch);
			}
			ch--;
			System.out.println();
		}
	}
}

// Here is the Pattern : 
//				E   
//			D   D   D   
//		C   C   C   C   C   
//	B   B   B   B   B   B   B   
//A   A   A   A   A   A   A   A   A   