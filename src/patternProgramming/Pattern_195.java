package patternProgramming;

import java.util.Scanner;
public class Pattern_195 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int start = n;
		int space = 0;
		int mid = n / 2 + 1;
		int num = n;
		for (int i = 1; i <= n; i++) {
			int nums = num;
			// Print Spaces
			for (int j = 1; j <= space; j++) {
				System.out.print("   ");
			}

			// Print Pattern
			for (int j = 1; j <= start; j++) {
				System.out.printf("%-3d", nums--);
			}
			System.out.println();
			if (i < mid) {
				num -= 2;
				start -= 2;
				space++;
			} else {
				num += 2;
				start += 2;
				space--;
			}
		}
	}
}

// Here is the Pattern : 

/*
7  6  5  4  3  2  1  
   5  4  3  2  1  
      3  2  1  
         1  
      3  2  1  
   5  4  3  2  1  
7  6  5  4  3  2  1 
*/