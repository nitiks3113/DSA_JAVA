package loops.whileloop.whileloop3;

// Design a method which will accept a number and will return true if all the digits of the number is in decreasing order.
import java.util.Scanner;

public class CheckDecreasingDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		boolean res = checkOrder(num);
		if (res == true) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		sc.close();
	}

	public static boolean checkOrder(int number) {
		int temp;
		int nextTemp = Integer.MIN_VALUE;
		boolean res = true;
		while (number > 0) {
			temp = number % 10;
			if (nextTemp <= temp) {
				res = true;
			} else {
				return false;
			}
			nextTemp = temp;
			number /= 10;
		}
		if (res == true) {
			return true;
		}
		return false;
	}

}
