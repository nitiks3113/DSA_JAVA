package string;

// WAJP to take a String input and count all the characters without spaces in the String.
import java.util.Scanner;
public class CountCharactersWithoutSpaces {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		sc.close();
		int countCharacters = countCharacters(str);
		System.out.println("Total number of characters without spaces is : "
				+ countCharacters);
	}

	public static int countCharacters(String str) {
		int count = 0;
		for (char c : str.toCharArray()) {
			if (c != ' ')
				count++;
		}
		return count;
	}

}
