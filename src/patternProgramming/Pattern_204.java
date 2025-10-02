package patternProgramming;

import java.util.Scanner;
public class Pattern_204 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int start = 1;
		int end = n;
		int mid = n / 2 + 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j <= start || j >= end) {
					if (j % 2 == 0)
						System.out.print("0 ");
					else
						System.out.print("1 ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();
			if (i < mid) {
				start++;
				end--;
			} else {
				start--;
				end++;
			}
		}
	}
}


// Here is the Pattern : 

/*
1           1 
1 0       0 1 
1 0 1   1 0 1 
1 0 1 0 1 0 1 
1 0 1   1 0 1 
1 0       0 1 
1           1 
*/