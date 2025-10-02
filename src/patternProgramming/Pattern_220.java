package patternProgramming;

import java.util.Scanner;
public class Pattern_220 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int n = sc.nextInt();
		sc.close();
		printSeries(n);
	}

	public static void printSeries(int n) {
		int num = 2;
		for (int i = 1; i <= n; i++) {
			System.out.print(num + "  ");
			int nextNum = num * 2 + 1;
			num = nextNum;
		}
	}
}

// Here is the Series : 

// 2  5  11  23  47  95  191  383  767  1535  