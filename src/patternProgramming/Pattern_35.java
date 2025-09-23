package patternProgramming;

// Thirty-fifth Pattern Problem
import java.util.Scanner;
public class Pattern_35 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of rows : ");
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			// Print Spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}

			// Print Digits
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

}
// Here is the Pattern : 
//            1 
//          1 2 
//        1 2 3 
//      1 2 3 4 
//    1 2 3 4 5 
//  1 2 3 4 5 6 
//1 2 3 4 5 6 7 
