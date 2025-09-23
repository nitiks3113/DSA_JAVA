package patternProgramming;

// Thirty-Nineth Pattern Probelm
import java.util.Scanner;
public class Pattern_39 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of rows : ");
		int n = sc.nextInt();
		sc.close();
		int num = n;
		for (int i = 1; i <= n; i++) {
			// Print Spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("   ");
			}
			// Print Digits
			for (int k = 1; k <= i; k++) {
				System.out.printf("%3d", num);
			}
			num--;
			System.out.println();
		}
	}

}
// Here is the Pattern : 
//                  7
//               6  6
//            5  5  5
//         4  4  4  4
//      3  3  3  3  3
//   2  2  2  2  2  2
//1  1  1  1  1  1  1