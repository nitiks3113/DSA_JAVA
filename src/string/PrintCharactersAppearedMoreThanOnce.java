package string;

/*
 * WAJP to print all the character which has appeared more than once in the String.
*/
import java.util.*;

public class PrintCharactersAppearedMoreThanOnce {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		sc.close();
		printCharacters(str);
	}

	public static void printCharacters(String str) {
		int[] freq = new int[256];
		for (char c : str.toCharArray())
			freq[c]++;

		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > 1)
				System.out.print((char) i + " ");
		}
	}
}

/*
Enter the String : My name is Nitik Kumar Sahay
a i m y 
*/