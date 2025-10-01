package patternProgramming;

import java.util.Scanner;
public class Pattern_186 {

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
		int num = 1;
		for (int i = 1; i <= n; i++) {
			// Print Spaces
			for (int j = 1; j <= space; j++) {
				System.out.print("   ");
			}

			// Print Pattern
			for (int j = 1; j <= start; j++) {
				System.out.printf("%-3d", num++);
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
1  2  3  4  5  6  7  
   8  9  10 11 12 
      13 14 15 
         16 
      17 18 19 
   20 21 22 23 24 
25 26 27 28 29 30 31 
*/