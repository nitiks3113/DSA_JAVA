package patternProgramming;

// Ninety-fourth Pattern Problem 
import java.util.Scanner;
public class Pattern_94 {

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

			// Print Star
			for (int k = 1; k <= n - i + 1; k++) {
				System.out.printf("* ");
			}
			System.out.println();
		}
	}

}

// Here is the Pattern : 
//* * * * * * * 
//* * * * * * 
// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//     * 