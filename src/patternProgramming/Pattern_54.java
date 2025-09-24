package patternProgramming;

// Fifty-fourth Pattern Problem 
import java.util.Scanner;
public class Pattern_54 {

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

			// Print Digits Pyramid
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

}
// Here is the Pattern : 
//    1 
//   1 2 
//  1 2 3 
// 1 2 3 4 
//1 2 3 4 5