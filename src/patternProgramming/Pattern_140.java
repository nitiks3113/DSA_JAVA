package patternProgramming;

import java.util.Scanner;
public class Pattern_140 {

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
		int start = mid;
		int num = 1;
		for (int i = 1; i <= n; i++) {
			// Print Spaces
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}

			// Print Numbers
			for (int j = 1; j <= num; j++) {
				System.out.printf("%-4d", start);
			}
			System.out.println();
			if (i < mid) {
				start--;
				num++;
				space--;
			} else {
				start++;
				num--;
				space++;
			}
		}
	}
}

// Here is the Pattern : 
/*
	  4   
	3   3   
  2   2   2   
1   1   1   1   
  2   2   2   
	3   3   
	  4  
*/