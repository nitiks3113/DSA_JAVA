package string;

/*
 * WAJP to print all the character which has appeared exactly once in the String.
*/
import java.util.*;

public class PrintCharacterAppearedOnce {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		sc.close();
		printCharacterAppearedOnce(str);
	}

	public static void printCharacterAppearedOnce(String str) {
		int[] freq = new int[256];
		for (char c : str.toCharArray()) {
			freq[c]++;
		}

		for (int i = 0; i < freq.length; i++) {
			if (freq[i] == 1)
				System.out.print((char) i + " ");
		}
	}
}

/*
Enter the String : My Name is Nitik Kumar Sahay
K M S e h k r s t u 
*/