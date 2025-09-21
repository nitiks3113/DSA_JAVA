package operators.conditionaloperator;

// WAJP to check whether the given character is an alphabet or not.
import java.util.Scanner;

public class CheckAlphabet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character : ");
		char ch = sc.next().charAt(0);
		String result = ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) ? "Valid Alphabet" : "Not an Alphabet";
		System.out.println(result);
		sc.close();

	}

}

// Work on : If user enters "abcd" like input then it mush show this is not an valid input , try to enter a single letter.
