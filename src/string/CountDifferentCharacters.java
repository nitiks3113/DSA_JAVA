package string;

// WAJP to take a String input and count all the space characters, uppercase, lowercase, numeric, special characters in the String.
import java.util.Scanner;
public class CountDifferentCharacters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		sc.close();
		countDifferentCharacters(str);
	}

	public static void countDifferentCharacters(String str) {
		int countSpace = 0;
		int countUpperCase = 0;
		int countLowerCase = 0;
		int countNumeric = 0;
		int countSpecial = 0;
		for (char c : str.toCharArray()) {
			if (c == ' ')
				countSpace++;
			else if (c >= 'a' && c <= 'z')
				countLowerCase++;
			else if (c >= 'A' && c <= 'Z')
				countUpperCase++;
			else if (c >= '0' && c <= '9')
				countNumeric++;
			else
				countSpecial++;
		}

		System.out.println("Spaces : " + countSpace);
		System.out.println("UpperCase : " + countUpperCase);
		System.out.println("LowerCase : " + countLowerCase);
		System.out.println("Numeric : " + countNumeric);
		System.out.println("Special : " + countSpecial);
	}
}
