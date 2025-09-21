package operators.conditionaloperator;

// Return second largest of three distinct numbers using ternary operator only.
import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a : ");
		int a = sc.nextInt();
		System.out.print("Enter b : ");
		int b = sc.nextInt();
		System.out.print("Enter c : ");
		int c = sc.nextInt();
		int secondLargest = (a > b && b > c) ? b
				: (a > c && c > b) ? c : (b > a && a > c) ? a : (b > c && c > a) ? c : (c > a && a > b) ? a : b;
		System.out.println("Second Largest is : " + secondLargest);
		sc.close();
	}

}
