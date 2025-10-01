package patternProgramming;

import java.util.Scanner;
public class Pattern_198 {

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
		char ch = 'A';
		for (int i = 1; i <= n; i++) {
			char ch1 = ch;
			// Print Spaces
			for (int j = 1; j <= space; j++) {
				System.out.print("   ");
			}

			// Print Pattern
			for (int j = 1; j <= start; j++) {
				if (j < (start + 1) / 2)
					System.out.printf("%-3c", ch1++);
				else
					System.out.printf("%-3c", ch1--);
			}
			System.out.println();
			if (i < mid) {
				start -= 2;
				space++;
			} else {
				start += 2;
				space--;
			}
		}
	}
}

// Here is the Pattern : 

/*
A  B  C  D  C  B  A  
   A  B  C  B  A  
      A  B  A  
         A  
      A  B  A  
   A  B  C  B  A  
A  B  C  D  C  B  A 
*/