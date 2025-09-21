package operators.conditionaloperator;

// WAJP to check whether the given character is an upper case alphabet or not.
import java.util.Scanner;

public class CheckUpperCaseAlphabet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the letter : ");
		char ch = sc.next().charAt(0);
		String result = (ch >= 'A' && ch <= 'Z') ? "Upper Case Alphabet" : "Not an Upper Case Alphabet";
		System.out.println(result);
		sc.close();
	}

}
