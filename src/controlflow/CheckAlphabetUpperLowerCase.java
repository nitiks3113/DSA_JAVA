package controlflow;

// WAJP to take a character input and print it is upper case, lower case or other alphabet using if else statement.
import java.util.Scanner;

public class CheckAlphabetUpperLowerCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Character input to check : ");
		char ch = sc.next().charAt(0);
		sc.close();

		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("'" + ch + "' is an UPPERCASE letter");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("'" + ch + "' is a lowercase letter");
		} else {
			System.out.println("'" + ch + "' is NOT an alphabet");
		}
	}

}
