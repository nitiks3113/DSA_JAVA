package patternProgramming;

import java.util.Scanner;
public class Pattern_223 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int n = sc.nextInt();
		sc.close();
		printSeries(n);
	}

	public static void printSeries(int n) {
		int num = 1;
		int nextNum = num;
		for (int i = 1; i <= n; i++) {
			System.out.print(num + "   ");
			if (i % 2 == 0) {
				nextNum = num * 3;
			} else {
				nextNum = num + 1;
			}
			num = nextNum;
		}
	}

}

// Here is the Series : 

// 1   2   6   7   21   22   66   67   201   202  