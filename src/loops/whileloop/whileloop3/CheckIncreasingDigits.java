package loops.whileloop.whileloop3;

// Design a method which will accept a number and will return true if all the digits of the number is in increasing order.
import java.util.Scanner;

public class CheckIncreasingDigits {

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
		int nextTemp = Integer.MAX_VALUE;
		boolean res = true;
		while (number > 0) {
			temp = number % 10;
			if (nextTemp >= temp) {
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
// This code has an error , it not works on input 132
