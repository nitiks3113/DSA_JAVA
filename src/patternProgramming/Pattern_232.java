package patternProgramming;

import java.util.Scanner;
public class Pattern_232 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int sStar = 1;
		int eStar = 2 * n - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= eStar; j++) {
				if (j == sStar || j == eStar || i == 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
			eStar--;
			sStar++;
		}
	}
}

// Here is the Pattern : 

/*
* * * * * * * * * * * * * 
  *                   * 
    *               * 
      *           * 
        *       * 
          *   * 
            * 
*/