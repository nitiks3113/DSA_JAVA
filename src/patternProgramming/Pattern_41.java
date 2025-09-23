package patternProgramming;

// Forty-First Pattern Problem 
import java.util.Scanner;
public class Pattern_41 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of rows : ");
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			int num = i * (i + 1) / 2;
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
//            1  
//         3  2  
//      6  5  4  
//   10 9  8  7  
//15 14 13 12 11 
