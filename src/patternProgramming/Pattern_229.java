package patternProgramming;

import java.util.Scanner;
public class Pattern_229 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int sStar = n;
		int eStar = n;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= eStar; j++) {
				if (j == sStar || j == eStar || i == n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
			sStar--;
			eStar++;
		}
	}
}

// Here is the Pattern : 

/*
        * 
      *   * 
    *       * 
  *           * 
* * * * * * * * *
*/