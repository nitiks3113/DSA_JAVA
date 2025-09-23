package patternProgramming;

// Thirty-Eighth Pattern Problem
import java.util.Scanner;
public class Pattern_38 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of rows : ");
		int n = sc.nextInt();
		sc.close();
		int num = n * (n + 1) / 2;
		for (int i = 1; i <= n; i++) {
			// Print Spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("   ");
			}

			// Print Digits
			for (int k = 1; k <= i; k++) {
				System.out.printf("%-3d", num--);
			}
			System.out.println();
		}
	}

}
// Here is the Pattern : 
//                  28 
//               27 26 
//            25 24 23 
//         22 21 20 19 
//      18 17 16 15 14 
//   13 12 11 10 9  8  
//7  6  5  4  3  2  1