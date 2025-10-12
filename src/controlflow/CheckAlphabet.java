package controlflow;

// WAJP to take a character input and print it is alphabet or not using if else statement.
import java.util.Scanner;

public class CheckAlphabet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character to check : ");
		char ch = sc.next().charAt(0);
		if (ch >= 'A' && ch <= 'Z')
			System.out.println(ch + " is an upperCase Alphabet.");
		else if (ch >= 'a' && ch <= 'z')
			System.out.println(ch + " is a lowerCase Alphabet.");
		else
			System.out.println(ch + " is not an Alphabet.");
		sc.close();
	}

}
