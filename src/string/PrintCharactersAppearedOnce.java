package string;

/*
 * WAJP to print the character which is appeared only once in the String. Given that only one character has appeared once in the string.
 */
import java.util.*;

public class PrintCharactersAppearedOnce {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		sc.close();
		printCharOnce(str);
	}

	public static void printCharOnce(String str) {
		int[] freq = new int[256];
		for (char c : str.toCharArray())
			freq[c]++;
		boolean found = false;
		for (char c : str.toCharArray()) {
			if (freq[c] == 1) {
				found = true;
				System.out.println("The character which appeared only once is: " + c);
				break;
			}
		}
		if (!found)
			System.out.println("No unique character found in the string.");
	}
}

/*
 * Enter the String : abaccdd The character which appeared only once is: b
 */