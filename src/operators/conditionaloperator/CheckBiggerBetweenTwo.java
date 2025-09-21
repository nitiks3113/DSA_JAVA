package operators.conditionaloperator;

// WAJP to print the bigger of two numbers.
import java.util.Scanner;

public class CheckBiggerBetweenTwo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a : ");
		int a = sc.nextInt();
		System.out.print("Enter b : ");
		int b = sc.nextInt();
		String result = (a < b) ? b + " is Bigger." : (b < a) ? a + " is Bigger." : "They are equal";
		System.out.println(result);
		sc.close();
	}

}
