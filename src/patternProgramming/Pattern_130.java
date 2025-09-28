package patternProgramming;

import java.util.Scanner;
public class Pattern_130 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int star = 1;
		int space = n / 2;
		int mid = (n / 2) + 1;
		for (int i = 1; i <= n; i++) {
			// Print Spaces
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}

			// Print Star
			for (int j = 1; j <= star; j++) {
				System.out.print("*   ");
			}
			System.out.println();
			if (i < mid) {
				star++;
				space--;
			} else {
				space++;
				star--;
			}
		}
	}
}

// Here is the Pattern : 
//      *   
//    *   *   
//  *   *   *   
//*   *   *   *   
//  *   *   *   
//    *   *   
//  	*   