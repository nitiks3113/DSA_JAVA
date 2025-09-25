package patternProgramming;

// Fifty-eighth Pattern Problem 
import java.util.Scanner;
public class Pattern_58 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		for (int i = 1; i <= n; i++) {
			int start = i;
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
//        1   
//      2   1   
//    3   2   1   
//  4   3   2   1   
//5   4   3   2   1   
