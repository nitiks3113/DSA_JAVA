package loops.dowhileloop;

// WAJP to print power of a and b and ask user in end to press Y/y to continue or any other key to exit.
import java.util.Scanner;

public class PrintPower {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char choice;
		System.out.println("============Program Starts===========");
		do {
			System.out.print("Enter the number a : ");
			int a = sc.nextInt();
			System.out.print("Enter the number b : ");
			int b = sc.nextInt();
			double res = powerCalculate(a, b);
			System.out.println("Power of : " + a + " to the : " + b + " is : " + res);
			System.out.print("Do you want to continue? (Y/n): ");
			choice = sc.next().charAt(0);
		} while (choice == 'Y' || choice == 'y');
		System.out.println("==========Program Ends=================");
		sc.close();
	}

	public static double powerCalculate(int a, int b) {
		double i = 1;
		double result = 1;
		while (i <= b) {
			result *= a;
			i++;
		}
		return result;
	}

}

// Try for Negative Powers 