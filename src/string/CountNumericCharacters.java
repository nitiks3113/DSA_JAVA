package string;

//  WAJP to take a String input and count all numeric characters in the String.
import java.util.Scanner;
public class CountNumericCharacters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		sc.close();
		int countNumeric = countNumericCharacters(str);
		System.out.println("Total Numeric Character in the " + str + " is : "
				+ countNumeric);
	}

	public static int countNumericCharacters(String s) {
		int count = 0;
		for (char c : s.toCharArray()) {
			if (c >= 48 && c <= 57) {
				count++;
			}
		}
		return count;
	}
}
