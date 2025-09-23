package patternProgramming;

// Sixteenth Pattern Problem
import java.util.Scanner;
public class Pattern_16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of rows : ");
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			// Print Spaces
			for (int j = 1; j <= i - 1; j++) {
				System.out.print("  ");
			}
			// Print Stars
			for (int k = 1; k <= n - i + 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
// Here is the Pattern : 
//Enter the no. of rows : 7
//* * * * * * * 
//  * * * * * * 
//    * * * * * 
//      * * * * 
//        * * * 
//          * * 
//            * 