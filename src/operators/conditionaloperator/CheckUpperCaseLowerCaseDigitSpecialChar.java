package operators.conditionaloperator;

// Given a character, check if it's uppercase, lowercase, digit or special character.
import java.util.Scanner;

public class CheckUpperCaseLowerCaseDigitSpecialChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Something : ");
		char ch = sc.next().charAt(0);
		String result = (ch >= 'A' && ch <= 'Z') ? "Upper Case Alphabet"
				: (ch >= 'a' && ch <= 'z') ? "Lower Case Alphabet"
						: (ch >= '0' && ch <= '9') ? "It is Digit" : "It is Special Characters";
		System.out.println(result);
		sc.close();
	}

}
