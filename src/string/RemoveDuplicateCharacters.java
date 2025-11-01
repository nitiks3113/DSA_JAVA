package string;

/*
 *WAJP to take a String input and remove all the duplicate characters.
i/p: abcaxbdacdptx
o/p: abcxdpt
*/
import java.util.*;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		sc.close();
		removeDuplicates(str);
	}

	public static void removeDuplicates(String str) {
		StringBuilder res = new StringBuilder("");
		for (char c : str.toCharArray()) {
			if (res.indexOf(String.valueOf(c)) == -1)
				res = res.append(c);
		}
		System.out.println("Result String : " + res.toString());
	}
}

/*
Enter the String : mynameisnitikkumarsahay
Result String : mynaeistkurh
*/