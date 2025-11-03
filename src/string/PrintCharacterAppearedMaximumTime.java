package string;

/*
 * WAJP to print the character which is appeared for the maximum times in the String.
 */
import java.util.*;

public class PrintCharacterAppearedMaximumTime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		sc.close();
		printCharacter(str);
	}

	public static void printCharacter(String str) {

		if (str.isEmpty()) {
			System.out.println("String is empty.");
			return;
		}

		int[] freq = new int[256];
		int count = 0;
		char ch = 0;
		for (char c : str.toCharArray())
			freq[c]++;

		for (char c : str.toCharArray()) {
			if (freq[c] > count) {
				count = freq[c];
				ch = c;
			}
		}

		System.out.println("The Character which appeared maximum time is : " + ch);
	}
}

/*
Enter the String : MyNameIsNitikKumarSahay
The Character which appeared maximum time is : a
*/