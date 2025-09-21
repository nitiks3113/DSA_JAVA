package operators.conditionaloperator;

// For given numbers x and y. check whether y is a factor of x or not.
import java.util.Scanner;

public class CheckFactor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x : ");
		int x = sc.nextInt();
		System.out.print("Enter y: ");
		int y = sc.nextInt();
		if (y == 0) {
			System.out.println("Cannot check factor with y = 0");
		} else {
			String result = (x % y == 0) ? (y + " is a factor of " + x) : (y + " is not a factor of " + x);
			System.out.println(result);
		}

		sc.close();
	}

}
