package operators.conditionaloperator;

// WAJP to print the smallest of three numbers.
import java.util.Scanner;

public class PrintSmallestBetweenThree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a : ");
		int a = sc.nextInt();
		System.out.print("Enter b : ");
		int b = sc.nextInt();
		System.out.print("Enter c : ");
		int c = sc.nextInt();
		String result = (a == b && b == c) ? "All numbers are equal: " + a
				: (a <= b && a <= c) ? a + " is Smallest."
						: (b <= a && b <= c) ? b + " is Smallest." : c + " is Smallest.";

		System.out.println(result);
		sc.close();
	}

}
