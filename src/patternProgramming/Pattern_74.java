package patternProgramming;

// Seventy-fourth Pattern Problem 
import java.util.Scanner;
public class Pattern_74 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int start = 1;
		int width = String.valueOf(n * (n + 1) / 2).length();
		for (int i = 1; i <= n; i++) {
			// Print Spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.printf("%" + 2 * width + "s", "");
			}

			// Print Number
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.printf("%" + (-2) * width + "d", start++);
			}
			System.out.println();
		}
	}

}

// Here is the Pattern : 
//                1   
//            2   3   4   
//        5   6   7   8   9   
//    10  11  12  13  14  15  16  
//17  18  19  20  21  22  23  24  25 