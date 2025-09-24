package patternProgramming;

// Fifty-first Pattern Problem 
import java.util.Scanner;
public class Pattern_51 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			// Print Spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			// Print Characters
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
// Here is the Pattern : 
//      * 
//     * * 
//    * * * 
//   * * * * 
//  * * * * * 
// * * * * * * 
//* * * * * * *
