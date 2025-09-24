package patternProgramming;

// Forty-sixth Pattern Problem 
import java.util.Scanner;
public class Pattern_46 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		char ch = (char) (64 + (n * (n + 1) / 2));
		for (int i = 1; i <= n; i++) {
			// Print Spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("   ");
			}

			// Print Characters
			for (int k = 1; k <= i; k++) {
				System.out.printf("%3c", ch--);
			}
			System.out.println();
		}
	}

}
// Here is the Pattern : 
//            O
//         N  M
//      L  K  J
//   I  H  G  F
//E  D  C  B  A