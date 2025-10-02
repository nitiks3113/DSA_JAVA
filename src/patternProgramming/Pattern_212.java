package patternProgramming;

import java.util.Scanner;
public class Pattern_212 {

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
		char ch = (char) (64 + 2 * (((n - 1) / 2) * ((n - 1) / 2 + 1)) + n);
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j <= start || j >= end)
					System.out.printf("%-3c", ch--);
				else
					System.out.print("   ");
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
Q           P  
O  N     M  L  
K  J  I  H  G  
F  E     D  C  
B           A 
*/