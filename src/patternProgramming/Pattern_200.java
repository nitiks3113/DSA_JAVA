package patternProgramming;

import java.util.Scanner;
public class Pattern_200 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}
	public static void printPattern(int n) {
		int sStar = 1;
		int eStar = n;
		int mid = n / 2 + 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j <= sStar || j >= eStar)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
			if (i < mid) {
				sStar++;
				eStar--;
			} else {
				sStar--;
				eStar++;
			}
		}
	}

}

// Here is the Pattern : 

/*
*           * 
* *       * * 
* * *   * * * 
* * * * * * * 
* * *   * * * 
* *       * * 
*           * 
*/