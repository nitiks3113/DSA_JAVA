package operators.conditionaloperator;

// WAJP to print the smaller of two numbers.
import java.util.Scanner;

public class CheckSmallerBetweenTwo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a : ");
		int a = sc.nextInt();
		System.out.print("Enter b : ");
		int b = sc.nextInt();
		String result = (a < b) ? a + " is " + "Smaller." : (b < a) ? b + " is Smaller." : "They are equal";
		System.out.println(result);
		sc.close();
	}

}
