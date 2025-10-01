package patternProgramming;

import java.util.Scanner;
public class Pattern_182 {

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
				System.out.print("  ");
			}

			// Print Pattern
			for (int j = 1; j <= start; j++) {
				System.out.print(num + " ");
			}
			System.out.println();
			num++;
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
1 1 1 1 1 1 1 
  2 2 2 2 2 
    3 3 3 
      4 
    5 5 5 
  6 6 6 6 6 
7 7 7 7 7 7 7
*/