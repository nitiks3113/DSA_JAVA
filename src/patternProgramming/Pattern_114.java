package patternProgramming;

import java.util.Scanner;
public class Pattern_114 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int start = n;
		int num = start;
		for (int i = 1; i <= n; i++) {
			// Print Spaces
			for (int j = 1; j < i; j++) {
				System.out.print("    ");
			}

			// Print Numbers
			for (int k = 1; k <= (2 * (n - i + 1) - 1); k++) {
				System.out.printf("%-4d", num);
			}
			num--;
			System.out.println();
		}
	}
}

// Here is the Pattern : 
//5   5   5   5   5   5   5   5   5   
//	4   4   4   4   4   4   4   
//    	3   3   3   3   3   
//        	2   2   2   
//            	1