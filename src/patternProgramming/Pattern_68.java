package patternProgramming;

// Sixty-eighth Pattern Problem 
import java.util.Scanner;
public class Pattern_68 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int start = 1;
		for (int i = 1; i <= n; i++) {
			// Print Spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}

			// Print Stars
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print(start + " ");
			}
			start++;
			System.out.println();
		}
	}
}

// Here is the Pattern : 
//        1 
//      2 2 2 
//    3 3 3 3 3 
//  4 4 4 4 4 4 4 
//5 5 5 5 5 5 5 5 5