package patternProgramming;

import java.util.Scanner;
public class Pattern_143 {

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
		char ch = 'A';
		for (int i = 1; i <= n; i++) {
			// Print Spaces
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}

			// Print Characters
			for (int j = 1; j <= start; j++) {
				System.out.printf("%-4c", ch);
			}
			System.out.println();
			if (i < mid) {
				ch++;
				start++;
				space--;
			} else {
				ch--;
				start--;
				space++;
			}
		}
	}
}

// Here is the Pattern : 
/*
	  A   
	B   B   
  C   C   C   
D   D   D   D   
  C   C   C   
	B   B   
	  A  
*/