package patternProgramming;

import java.util.Scanner;
public class Pattern_142 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int mid = n / 2 + 1;
		int space = n / 2;
		int start = 1;
		for (int i = 1; i <= n; i++) {
			char ch = 'A';
			// Print Spaces
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}

			// Print Characters
			for (int j = 1; j <= start; j++) {
				System.out.printf("%-4c", ch++);
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
	  A   
	A   B   
  A   B   C   
A   B   C   D   
  A   B   C   
	A   B   
	  A   
*/