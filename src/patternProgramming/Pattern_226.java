package patternProgramming;

import java.util.Scanner;
public class Pattern_226 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int n = sc.nextInt();
		sc.close();
		printSeries(n);
	}

	public static void printSeries(int n) {
		int num = 1;
		for (int i = 1; i <= n; i++) {
			System.out.print(num + "   ");
			num = num * 2 + 1;
		}
	}
}

// Here is the Series : 

// 1   3   7   15   31   63   127   255   511 