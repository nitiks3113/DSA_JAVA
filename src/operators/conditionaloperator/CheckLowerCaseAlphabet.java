package operators.conditionaloperator;

// WAJP to check whether the given character is a lower case alphabet or not.
import java.util.Scanner;

public class CheckLowerCaseAlphabet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the letter : ");
		char ch = sc.next().charAt(0);
		String result = (ch >= 'a' && ch <= 'z') ? "Lower Case Alphabet" : "Not a Lower Case Alphabet";
		System.out.println(result);
		sc.close();
	}

}
