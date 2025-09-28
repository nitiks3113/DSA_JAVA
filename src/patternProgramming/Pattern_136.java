package patternProgramming;

import java.util.Scanner;
public class Pattern_136 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int mid = n / 2 + 1;
		int star = (n + 1) / 2;
		int start = star * star;
		int space = n / 2;
		int ind = 1;
		for (int i = 1; i <= n; i++) {
			// Print Spaces
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}

			// Print Numbers
			for (int j = 1; j <= ind; j++) {
				System.out.printf("%-4d", start--);
			}
			System.out.println();
			if (i < mid) {
				ind++;
				space--;
			} else {
				ind--;
				space++;
			}
		}
	}
}

// Here is the Pattern : 
/*
	  16  
	15  14  
  13  12  11  
10  9   8   7   
  6   5   4   
	3   2   
	  1  
*/