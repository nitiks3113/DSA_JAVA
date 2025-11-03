package string;

/*
 * WAJP to print the character which is appeared for the maximum times in the String.
If more than 1 character has appeared for maximum time, return the smallest character.
 */
import java.util.*;

public class PrintSmallestCharacterAppearedMaxTime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		sc.close();
		printCharacter(str);
	}

	public static void printCharacter(String str) {
		if (str.isEmpty()) {
			System.out.println("String is Empty.");
			return;
		}

		int[] freq = new int[256];
		for (char c : str.toCharArray())
			freq[c]++;

		int count = 0;
		char ch = 0;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > count) {
				count = freq[i];
				ch = (char) i;
			}
		}

		System.out.println("The character which appeared max is : " + ch);
	}
}

/*
Enter the String : zzbbccddeeaaooii
The character which appeared max is : a
*/