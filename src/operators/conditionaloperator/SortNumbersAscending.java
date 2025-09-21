package operators.conditionaloperator;

// Given three numbers, print them in sorted order (ascending).
import java.util.Scanner;

public class SortNumbersAscending {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a : ");
		int a = sc.nextInt();
		System.out.print("Enter b : ");
		int b = sc.nextInt();
		System.out.println("Enter c : ");
		int c = sc.nextInt();
		int smallest = (a <= b && a <= c) ? a : (b <= c) ? b : c;
		int largest = (a >= b && a >= c) ? a : (b >= c) ? b : c;
		int middle = (a != smallest && a != largest) ? a : (b != smallest && b != largest) ? b : c;
		System.out.println(smallest + " " + middle + " " + largest);
		sc.close();
	}

}
