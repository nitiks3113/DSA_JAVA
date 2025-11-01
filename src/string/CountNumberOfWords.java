package string;

/*
 * WAJP to take a String input and count total number of words in the String(Without using split method)
*/
import java.util.*;

public class CountNumberOfWords {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		sc.close();
		countWords(str);
	}

	public static void countWords(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (i == 0 && c != ' ' || str.charAt(i) != ' ' && str.charAt(i - 1) == ' ')
				count++;
		}
		System.out.println("Total no. of words : " + count);
	}
}

/*
Enter the String : My Name is Nitik Kumar Sahay
Total no. of words : 6
*/