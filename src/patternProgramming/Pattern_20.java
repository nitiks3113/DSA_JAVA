package patternProgramming;

import java.util.Scanner;

// Twentieth Pattern Problem 

public class Pattern_20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of rows : ");
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (j % 2 == 0) {
					System.out.print("0 ");
				} else {
					System.out.print("1 ");
				}
			}
			System.out.println();
		}
	}

}
// Here is the Pattern :
// Enter the no. of rows : 7
// 1
// 1 0
// 1 0 1
// 1 0 1 0
// 1 0 1 0 1
// 1 0 1 0 1 0
// 1 0 1 0 1 0 1