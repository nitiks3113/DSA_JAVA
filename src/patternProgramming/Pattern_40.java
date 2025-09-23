package patternProgramming;

// Fortieth Pattern Problem
import java.util.Scanner;
public class Pattern_40 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of rows : ");
		int n = sc.nextInt();
		sc.close();
		int num = 1;
		for (int i = 1; i <= n; i++) {
			num = i; 
			// Print Spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("   ");
			}

			// Print Digits
			for (int k = 1; k <= i; k++) {
				System.out.printf("%3d", num--);
			}
			System.out.println();
		}
	}

}
// Here is the Pattern : 
//                  1
//               2  1
//            3  2  1
//         4  3  2  1
//      5  4  3  2  1
//   6  5  4  3  2  1
//7  6  5  4  3  2  1
