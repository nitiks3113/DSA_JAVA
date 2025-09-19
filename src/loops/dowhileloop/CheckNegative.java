package loops.dowhileloop;

// WAJP to keep taking input from the user until they enter a negative number. When –ve number or zero is entered then print sum of all the +ve number entered.
import java.util.Scanner;

public class CheckNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		System.out.println("=======Program Starts=========");
		do {
			System.out.print("Enter the number : ");
			num = sc.nextInt();
			if (num >= 0) {
				sum += num;
			}
		} while (num > 0);
		System.out.println("The sum of the Positive Numbers is : " + sum);
		System.out.println("=========Program Ends=========");
		sc.close();
	}
}

// Focuse on Input Validations