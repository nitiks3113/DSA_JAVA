package patternProgramming;

import java.util.Scanner;
public class Pattern_219 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int space = n - 1;
		int num = 1;
		for (int i = 1; i <= n; i++) {
			// Print spaces
			for (int j = 1; j <= space; j++) {
				System.out.printf("%4s", "");
			}

			// Print Pattern
			for (int j = 1; j <= i; j++) {
				System.out.printf("%-8d", num * (num + 1));
				num++;
			}

			System.out.println();
			space--;
		}
	}
}

// Here is the Pattern : 

/*
            2       
        6       12      
    20      30      42      
56      72      90      110 
*/