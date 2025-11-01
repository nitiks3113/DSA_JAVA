package string;

// WAJP to check if a string contains only digits.
import java.util.*;

public class CheckStringContainsOnlyDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		sc.close();
		boolean res = checkDigits(str);
		if (res)
			System.out.println("The String contains Only Digit Character.");
		else
			System.out.println("The String does not contains Only Digit Character.");
	}

	public static boolean checkDigits(String str) {
		boolean res = false;
		for (char c : str.toCharArray()) {
			if (c >= '0' && c <= '9')
				res = true;
			else
				return false;

		}
		return res;
	}
}

/*
 Enter the String : 3113
The String contains Only Digit Character.
 */
