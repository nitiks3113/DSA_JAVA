package patternProgramming;

//  Seventy-third Pattern Problem 
import java.util.Scanner;
public class Pattern_73 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);

	}

	public static void printPattern(int n) {
		for (int i = 1; i <= n; i++) {
			int start = 2 * i - 1;
			// Print Spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}

			// Print Numbers
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print(start-- + " ");
			}
			System.out.println();
		}
	}

}

// Here is the Pattern : 
//        1 
//      3 2 1 
//    5 4 3 2 1 
//  7 6 5 4 3 2 1 
//9 8 7 6 5 4 3 2 1 