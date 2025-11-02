package string;

/*
 * WAJP to print all the character of the String exactly once.
*/
import java.util.*;

public class PrintExactlyOnce {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		sc.close();
		printOnce(str);
	}

	public static void printOnce(String str) {
		int[] res = buildFrequency(str);
		StringBuilder result = new StringBuilder("");
		for (int i = 0; i < res.length; i++) {
			if (res[i] > 0)
				result.append((char) i);
		}
		System.out.println("Result : " + result.toString());
	}

	public static int[] buildFrequency(String str) {
		int[] freq = new int[256];
		for (char c : str.toCharArray())
			freq[c]++;
		return freq;
	}
}
