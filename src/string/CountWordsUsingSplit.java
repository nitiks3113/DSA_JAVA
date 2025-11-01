package string;

/*
 * WAJP to take a String input and count total number of words in the String(Using split method)
*/
import java.util.*;

public class CountWordsUsingSplit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		sc.close();
		countWords(str);
	}

	public static void countWords(String str) {
		int wordCount = 0;
		String[] words = str.split(" ");
		for (String word : words) {
			wordCount++;
		}
		System.out.println("Total no. of Words : " + wordCount);
	}
}

/*
Enter the String : My Name is Nitik Kumar Sahay
Total no. of Words : 6
*/