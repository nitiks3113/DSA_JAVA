package patternProgramming;

import java.util.Scanner;
public class Pattern_187 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int start = n;
		int space = 0;
		int mid = n / 2 + 1;
		int num = 2 * (mid * mid) - 1;
		for (int i = 1; i <= n; i++) {
			// Print Spaces
			for (int j = 1; j <= space; j++) {
				System.out.print("   ");
			}

			// Print Pattern
			for (int j = 1; j <= start; j++) {
				System.out.printf("%-3d", num--);
			}
			System.out.println();
			if (i < mid) {
				start -= 2;
				space++;
			} else {
				start += 2;
				space--;
			}
		}
	}
}

// Here is the Pattern : 

/* 
31 30 29 28 27 26 25 
   24 23 22 21 20 
      19 18 17 
         16 
      15 14 13 
   12 11 10 9  8  
7  6  5  4  3  2  1 
*/