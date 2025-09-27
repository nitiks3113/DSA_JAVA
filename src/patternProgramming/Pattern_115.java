package patternProgramming;

import java.util.Scanner;
public class Pattern_115 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int start = 2 * n - 1;
		for (int i = 1; i <= n; i++) {
			int num = start;
			// Print Spaces
			for (int j = 1; j < i; j++) {
				System.out.print("    ");
			}

			// Print Numbers
			for (int k = 1; k <= (2 * (n - i + 1) - 1); k++) {
				System.out.printf("%-4d", num--);
			}
			start -= 2;
			System.out.println();
		}
	}
}

// Here is the Pattern : 
//9   8   7   6   5   4   3   2   1   
//	7   6   5   4   3   2   1   
//    	5   4   3   2   1   
//        	3   2   1   
//            	1