package loops.whileloop.whileloop3;

// Write a java program to take a user input and print the product of each digit of the number will be even or Odd.
import java.util.Scanner;

public class CheckProductEvenOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int temp;
		int prod = 1;
		while (num > 0) {
			temp = num % 10;
			prod *= temp;
			num /= 10;
		}
		if (prod % 2 == 0) {
			System.out.println("The Product of the digits is even.");
		} else {
			System.out.println("The Product of the digits is odd.");
		}
		sc.close();
	}

}
