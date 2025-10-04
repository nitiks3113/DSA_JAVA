package patternProgramming;

import java.util.Scanner;
public class Pattern_249 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				int start = 1 + (j - 1) * (n + 1) - (j - 1) * j / 2;
				int val;
				if (j % 2 == 1) {
					val = start + (n - i);
				} else {
					val = start + (i - j);
				}
				System.out.printf("%-4d", val);
			}
			System.out.println();
		}
	}
}

// Here is the Pattern : 

/*
5   
4   6   
3   7   12  
2   8   11  13  
1   9   10  14  15
*/