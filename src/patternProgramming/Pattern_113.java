package patternProgramming;

import java.util.Scanner;
public class Pattern_113 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int start = n * n;
		for (int i = 1; i <= n; i++) {
			// Print Spaces
			for (int j = 1; j < i; j++) {
				System.out.print("    ");
			}

			// Print Numbers
			for (int k = 1; k <= (2 * (n - i + 1) - 1); k++) {
				System.out.printf("%-4d", start--);
			}
			System.out.println();
		}
	}
}

// Here is the Pattern : 
//36  35  34  33  32  31  30  29  28  27  26  
//    24  23  22  21  20  19  18  17  
//    	16  15  14  13  12  11  10  
//        	9   8   7   6   5   
//            	4   3   2   
//                	1  