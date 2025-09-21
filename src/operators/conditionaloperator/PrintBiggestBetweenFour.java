package operators.conditionaloperator;

// WAJP to print the biggest of four numbers.
import java.util.Scanner;

public class PrintBiggestBetweenFour {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a : ");
		int a = sc.nextInt();
		System.out.print("Enter b : ");
		int b = sc.nextInt();
		System.out.print("Enter c ");
		int c = sc.nextInt();
		System.out.print("Enter d : ");
		int d = sc.nextInt();
		String result = (a == b && b == c && c == d) ? "All are Equal : " + a
				: (a >= b && a >= c && a >= d) ? "Biggest : " + a
						: (b >= a && b >= c && b >= d) ? "Biggest : " + b
								: (c >= b && c >= a && c >= d) ? "Biggest : " + c : "Biggest : " + d;
		System.out.println(result);
		sc.close();
	}

}
