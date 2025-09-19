package loops.whileloop.whileloop3;

// Write a java program to take a user input and print the factorial of each digits of the number.
import java.util.Scanner;

public class PrintFactorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int temp;
		while (num > 0) {
			temp = num % 10;
			Factorial(temp);
			num /= 10;
		}
		sc.close();
	}

	public static void Factorial(int n) {
		int fact = 1;
		int nums = n;
		while (n > 0) {
			fact = fact * n;
			n--;
		}
		System.out.println("The Factorial of the digit : " + nums + " is : " + fact);
	}

}
