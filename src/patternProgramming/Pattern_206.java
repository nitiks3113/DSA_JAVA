package patternProgramming;

import java.util.Scanner;
public class Pattern_206 {

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
			int num = 1;
			boolean rightPart = false;
			for (int j = 1; j <= n; j++) {
				if (j <= start && j <= mid)
					System.out.print(num++ + " ");
				else if (j >= end) {
					if (!rightPart) {
						rightPart = true;
						if (i == mid)
							num--;
					}
					System.out.print(--num + " ");
				} else
					System.out.print("  ");
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
1 2       2 1 
1 2 3   3 2 1 
1 2 3 4 3 2 1 
1 2 3   3 2 1 
1 2       2 1 
1           1
*/