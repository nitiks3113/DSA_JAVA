package patternProgramming;

// Sixth Pattern Problem 
import java.util.Scanner;

public class Pattern_06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || i == 2 || i == n - 1 || j == 1 || j == n || j == 2 || j == n - 1) {
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
//* * * * * * * * * 
//* * * * * * * * * 
//* *           * * 
//* *           * * 
//* *           * * 
//* *           * * 
//* *           * * 
//* * * * * * * * * 
//* * * * * * * * * 
