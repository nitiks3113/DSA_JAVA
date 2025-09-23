package patternProgramming;

// Forty-third Pattern Problem 
import java.util.Scanner;
public class Pattern_43 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of rows : ");
		int n = sc.nextInt();
		sc.close();
		char ch = 'A';
		for (int i = 1; i <= n; i++) {
			// Print Spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("   ");
			}

			// Print Digits
			for (int k = 1; k <= i; k++) {
				System.out.printf("%3c", ch);
			}
			ch++;
			System.out.println();
		}
	}

}
// Here is the Pattern : 
//            A
//         B  B
//      C  C  C
//   D  D  D  D
//E  E  E  E  E