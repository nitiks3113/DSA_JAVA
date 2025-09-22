package patternProgramming;

// Seventh Pattern Problem.
import java.util.Scanner;

public class Pattern_07_Cross {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == i || j == (n - i + 1)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
// Here is the Pattern : 
//*           * 
//  *       *   
//    *   *     
//      *       
//    *   *     
//  *       *   
//*           * 
