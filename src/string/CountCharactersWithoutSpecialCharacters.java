package string;

// WAJP to take a String input and count all the characters(excluding any special characters).
import java.util.Scanner;
public class CountCharactersWithoutSpecialCharacters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		sc.close();
		int countCharacters = countCharacters(str);
		System.out.println("Total Characters is : " + countCharacters);
	}

	public static int countCharacters(String str) {
		int count = 0;
		for (char c : str.toCharArray()) {
			if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')
					|| (c >= '0' && c <= '9')) {
				count++;
			}
		}
		return count;
	}
}
