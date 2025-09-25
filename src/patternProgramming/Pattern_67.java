package patternProgramming;

// Sixty-seventh Pattern Problem 
import java.util.Scanner;
public class Pattern_67 {

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
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}

			// Print Star
			for (int k = 1; k <= (1 + (i - 1) * 2); k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

// Here is the Pattern : 
//            * 
//          * * * 
//        * * * * * 
//      * * * * * * * 
//    * * * * * * * * * 
//  * * * * * * * * * * * 
//* * * * * * * * * * * * * 