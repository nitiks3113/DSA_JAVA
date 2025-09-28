package patternProgramming;

import java.util.Scanner;
public class Pattern_149 {

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
		for (int i = 1; i <= n; i++) {
			// Print Spaces
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}

			// Print Pattern
			for (int j = 1; j <= start; j++) {
				if (i % 2 == 0)
					System.out.printf("%-2d", 0);
				else
					System.out.printf("%-2d", 1);
			}
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
    0 0 0 
  1 1 1 1 1 
0 0 0 0 0 0 0 
  1 1 1 1 1 
    0 0 0 
      1 
*/
