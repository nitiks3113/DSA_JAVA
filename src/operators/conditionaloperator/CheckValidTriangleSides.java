package operators.conditionaloperator;

// WAJP to check whether the three sides of a triangle is valid or not.
import java.util.Scanner;

public class CheckValidTriangleSides {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a : ");
		int a = sc.nextInt();
		System.out.print("Enter b : ");
		int b = sc.nextInt();
		System.out.print("Enter c : ");
		int c = sc.nextInt();
		if (a <= 0 || b <= 0 || c <= 0) {
			System.out.println("Triangle sides must be positive!");
		} else {
			String result = ((a + b > c) && (b + c > a) && (c + a > b)) ? "This is a Valid Triangle"
					: "This is not a Valid Triangle";
			System.out.println(result);
		}
		sc.close();
	}

}
