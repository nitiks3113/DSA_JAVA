package patternProgramming;

// Thirty-seventh Pattern Problem
import java.util.Scanner;
public class Pattern_37 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of rows : ");
		int n = sc.nextInt();
		sc.close();
		int num = 1;
		for (int i = 1; i <= n; i++) {
			// Print Spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("   ");
			}

			// Print Digits
			for (int k = 1; k <= i; k++) {
				System.out.printf("%3d", num++);
			}
			System.out.println();
		}
	}

}
// Here is the Pattern : 
//                   1
//                2  3
//             4  5  6
//          7  8  9 10
//      11 12 13 14 15
//   16 17 18 19 20 21
//22 23 24 25 26 27 28
