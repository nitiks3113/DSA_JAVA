package patternProgramming;

// Sixtieth Pattern Problem 
import java.util.Scanner;
public class Pattern_60 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int start = n;
		for (int i = 1; i <= n; i++) {
			// Print Spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}

			// Print Number Pyramid
			for (int k = 1; k <= i; k++) {
				System.out.printf("%-4d", start);
			}
			start--;
			System.out.println();
		}
	}

}

// Here is the Pattern : 
//        5   
//      4   4   
//    3   3   3   
//  2   2   2   2   
//1   1   1   1   1   