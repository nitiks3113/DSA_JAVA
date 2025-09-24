package patternProgramming;

// Fifty-second Pattern Problem
import java.util.Scanner;
public class Pattern_52 {

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

			// Print Digits
			for (int k = 1; k <= i; k++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
// Here is the Pattern : 
//      1 
//     2 2 
//    3 3 3 
//   4 4 4 4 
//  5 5 5 5 5 
// 6 6 6 6 6 6 
//7 7 7 7 7 7 7