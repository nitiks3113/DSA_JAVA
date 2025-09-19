package loops.whileloop.whileloop2;

// WAJP to take input from the user and print the factorial of that number.
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int number = sc.nextInt();
		int tempnumber = number;
		int fact = 1;
		while (number >= 1) {
			fact *= number;
			number--;
		}
		System.out.println("The Factorial of the number : " + tempnumber + " is : " + fact);
		sc.close();
	}

}
