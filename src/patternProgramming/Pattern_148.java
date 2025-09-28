package patternProgramming;

import java.util.Scanner;
public class Pattern_148 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int start = 1;
		int mid = n / 2 + 1;
		int space = n / 2;
		int num = 1;
		for (int i = 1; i <= n; i++) {
			// Print Space
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}

			// Print Pattern
			for (int j = 1; j <= start; j++) {
				System.out.printf("%-2d", num);
			}
			num++;
			System.out.println();
			if (i < mid) {
				start += 2;
				space--;
			} else {
				start -= 2;
				space++;
			}
		}
	}
}

// Here is the Pattern : 
/*
	  1 
	2 2 2 
  3 3 3 3 3 
4 4 4 4 4 4 4 
  5 5 5 5 5 
	6 6 6 
	  7 
*/