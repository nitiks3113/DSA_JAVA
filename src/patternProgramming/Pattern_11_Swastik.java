package patternProgramming;

// Eleventh Pattern Program.
import java.util.Scanner;

public class Pattern_11_Swastik {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		int mid = n / 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == mid + 1 || j == mid + 1 || i == 1 && j > mid
						|| i > mid && j == n || i == n && j <= mid
						|| i <= mid && j == 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}

// These Programs have limitations , they does not work properly when number of
// rows is even.
// Here is the Pattern : 
//*     * * * * 
//*     *       
//*     *       
//* * * * * * * 
//      *     * 
//      *     * 
//* * * *     * 