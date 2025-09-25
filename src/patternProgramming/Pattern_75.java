package patternProgramming;

// Seventy-fifth Pattern Problem 
import java.util.Scanner;
public class Pattern_75 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int start = n * n;
		int width = String.valueOf(n * (n + 1) / 2).length();
		for (int i = 1; i <= n; i++) {
			// Print Spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.printf("%" + 2 * width + "s", "");
			}

			// Print Numbers
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.printf("%" + (-2) * width + "d", start--);
			}
			System.out.println();
		}
	}

}

// Here is the Pattern : 
//				25  
//			24  23  22  
//		21  20  19  18  17  
//	16  15  14  13  12  11  10  
//9   8   7   6   5   4   3   2   1 
