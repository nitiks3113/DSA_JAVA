package patternProgramming;

// Forty-nineth Pattern Problem
import java.util.Scanner;
public class Pattern_49 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			char ch = (char) (64 + (i * (i + 1) / 2));
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
//            A
//         C  B
//      F  E  D
//   J  I  H  G
//O  N  M  L  K