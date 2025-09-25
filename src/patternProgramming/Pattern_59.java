package patternProgramming;

// Fifty-nineth Pattern Problem 
import java.util.Scanner;
public class Pattern_59 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		for (int i = 1; i <= n; i++) {
			int start = n;
			// Print Spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}

			// Print Number Pyramid
			for (int k = 1; k <= i; k++) {
				System.out.printf("%-4d", start--);
			}
			System.out.println();
		}
	}

}

// Here is the Pattern : 
//        5   
//      5   4   
//    5   4   3   
//  5   4   3   2   
//5   4   3   2   1   