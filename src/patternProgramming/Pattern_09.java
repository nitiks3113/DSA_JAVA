package patternProgramming;

// Ninth Pattern Problem
import java.util.Scanner;

public class Pattern_09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		int mid = n / 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == mid + 1 || j == mid + 1 || i == j || j == (n - i + 1) || i == 1 || i == n || j == 1
						|| j == n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
// Here is the Pattern : 
//* * * * * * * * * * * 
//* *       *       * * 
//*   *     *     *   * 
//*     *   *   *     * 
//*       * * *       * 
//* * * * * * * * * * * 
//*       * * *       * 
//*     *   *   *     * 
//*   *     *     *   * 
//* *       *       * * 
//* * * * * * * * * * * 
