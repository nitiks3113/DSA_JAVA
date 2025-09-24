package patternProgramming;

// Forty-fifth Pattern Problem 
import java.util.Scanner;
public class Pattern_45 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		char ch = 'A';
		for (int i = 1; i <= n; i++) {
			// Print Spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("   ");
			}

			// Print Characters
			for (int k = 1; k <= i; k++) {
				System.out.printf("%3c", ch++);
			}
			System.out.println();
		}
	}

}
// Here is the Pattern : 
//            A
//         B  C
//      D  E  F
//   G  H  I  J
//K  L  M  N  O