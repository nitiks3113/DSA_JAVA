package patternProgramming;

import java.util.Scanner;
public class Pattern_117 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int start = 1;
		for (int i = 1; i <= n; i++) {
			int num = start;
			// Print Spaces
			for (int j = 1; j < i; j++) {
				System.out.print("    ");
			}

			// Print Numbers
			for (int k = 1; k <= (2 * (n - i + 1) - 1); k++) {
				int mid = (2 * (n - i + 1) - 1) / 2 + 1;
				if (k < mid)
					System.out.printf("%-4d", num++);
				else
					System.out.printf("%-4d", num--);
			}
			start++;
			System.out.println();
		}
	}
}

// Here is the Pattern : 
//1   2   3   4   5   4   3   2   1   
//	2   3   4   5   4   3   2   
//    	3   4   5   4   3   
//        	4   5   4   
//            	5 