package operators.conditionaloperator;

import java.util.Scanner;

// WAJP to print the biggest of three numbers.
public class PrintBiggerBetweenThree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a : ");
		int a = sc.nextInt();
		System.out.print("Enter b : ");
		int b = sc.nextInt();
		System.out.print("Enter c : ");
		int c = sc.nextInt();
		String result = (a == b && b == c) ? "All numbers are equal: " + a
				: (a >= b && a >= c) ? a + " is Biggest."
						: (b >= a && b >= c) ? b + " is Biggest." : c + " is Biggest.";

		System.out.println(result);
		sc.close();
	}

}
