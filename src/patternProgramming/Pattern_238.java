package patternProgramming;

import java.util.Scanner;
public class Pattern_238 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int sStar = n / 2 + 1;
		int eStar = n / 2 + 1;
		int mid = n / 2 + 1;
		char ch = 'A';
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= eStar; j++) {
				if (j == sStar || j == eStar)
					System.out.print(ch + " ");
				else
					System.out.print("  ");
			}
			System.out.println();
			if (i < mid) {
				ch++;
				sStar--;
				eStar++;
			} else {
				ch--;
				sStar++;
				eStar--;
			}
		}
	}
}

// Here is the Pattern : 

/*
      A 
    B   B 
  C       C 
D           D 
  C       C 
    B   B 
      A
*/