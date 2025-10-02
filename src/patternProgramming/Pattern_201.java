package patternProgramming;

import java.util.Scanner;
public class Pattern_201 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int sNum = 1;
		int eNum = n;
		int mid = n / 2 + 1;
		int num1 = 1;
		// int num2 = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j <= sNum || j >= eNum) {
					System.out.print(num1 + " ");
				} else {
					System.out.print("  ");
				}
			}
			num1++;
			System.out.println();
			if (i < mid) {
				sNum++;
				eNum--;
			} else {
				sNum--;
				eNum++;
			}
		}
	}
}

// Here is the Pattern : 

/*
1           1 
2 2       2 2 
3 3 3   3 3 3 
4 4 4 4 4 4 4 
5 5 5   5 5 5 
6 6       6 6 
7           7
*/