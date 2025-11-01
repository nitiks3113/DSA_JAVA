package string;

/*
 * WAJP to take a String input and print sum of all the even numeric characters in the String.
*/
import java.util.*;

public class SumOfAllEvenNumericCharacter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		sc.close();
		printSum(str);
	}

	public static void printSum(String str) {
		int sum = 0;
		for (char c : str.toCharArray()) {
			if (c >= '0' && c <= '9') {
				int num = c - 48;
				if (num % 2 == 0)
					sum = sum + num;
			}
		}
		System.out.println("Sum of Even Numeric Characters are : " + sum);
	}
}
