package patternProgramming;

import java.util.Scanner;
public class Pattern_210 {

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
			char ch = 'A';
			for (int j = 1; j <= n; j++) {
				if (j <= start || j >= end)
					System.out.printf("%-3c", ch++);
				else {
					ch++;
					System.out.print("   ");
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
A                 G  
A  B           F  G  
A  B  C     E  F  G  
A  B  C  D  E  F  G  
A  B  C     E  F  G  
A  B           F  G  
A                 G 
*/