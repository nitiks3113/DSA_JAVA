package patternProgramming;

import java.util.Scanner;
public class Pattern_218 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int start = 1;
		int space = n;
		int num = 1;
		for (int i = 1; i <= n; i++) {
			// Print Spaces
			for (int j = 1; j <= space; j++) {
				System.out.print("    ");
			}

			// Print Pattern
			for (int j = 1; j <= start; j++) {
				System.out.printf("%-4d", num * (num + 1));
				num++;
			}
			start += 2;
			space--;
			System.out.println();
		}
	}
}

// Here is the Pattern : 

/*
                2   
            6   12  20  
        30  42  56  72  90  
    110 132 156 182 210 240 272
*/