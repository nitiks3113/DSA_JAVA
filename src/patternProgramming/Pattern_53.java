package patternProgramming;

// Fifty-third Pattern Problem 
import java.util.Scanner;
public class Pattern_53 {

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

			// Print Binary Digits
			for (int k = 1; k <= i; k++) {
				if (i % 2 == 0) {
					System.out.print("0 ");
				} else {
					System.out.print("1 ");
				}
			}
			System.out.println();
		}
	}

}
// Here is the Pattern : 
//    1 
//   0 0 
//  1 1 1 
// 0 0 0 0 
//1 1 1 1 1 