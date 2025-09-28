package patternProgramming;

import java.util.Scanner;
public class Pattern_132 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int space = n / 2;
		int mid = n / 2 + 1;
		int start = 1;
		for (int i = 1; i <= n; i++) {
			// Print Spaces
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}

			// Print Numbers
			for (int j = 1; j <= start; j++) {
				if (i % 2 == 0)
					System.out.print("0   ");
				else
					System.out.print("1   ");
			}

			System.out.println();
			if (i < mid) {
				start++;
				space--;
			} else {
				start--;
				space++;
			}
		}
	}
}

// Here is the Pattern : 
/*
	  1   
	0   0   
  1   1   1   
0   0   0   0   
  1   1   1   
    0   0   
      1 
*/