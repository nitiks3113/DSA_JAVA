package patternProgramming;

import java.util.Scanner;
public class Pattern_236 {

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
		int num = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= eStar; j++) {
				if (j == sStar || j == eStar)
					System.out.print(num + " ");
				else
					System.out.print("  ");
			}
			System.out.println();
			if (i < mid) {
				num++;
				sStar--;
				eStar++;
			} else {
				num--;
				sStar++;
				eStar--;
			}
		}
	}
}

// Here is the Pattern : 

/*
      1 
    2   2 
  3       3 
4           4 
  3       3 
    2   2 
      1 
*/