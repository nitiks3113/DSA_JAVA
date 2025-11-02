package string;

/*
 * WAJP to print all the character of the String exactly once(consider only alphabets in lowercase)
*/
import java.util.*;

public class RemoveDuplicatesConsiderLowerCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.next();
		sc.close();
		removeDuplicate(str);
	}

	public static void removeDuplicate(String str) {
		StringBuilder res = new StringBuilder("");
		for (char c : str.toCharArray()) {
			if (c >= 'a' && c <= 'z') {
				if (res.indexOf(String.valueOf(c)) == -1)
					res = res.append(c);
			}
		}
		System.out.println("Result String : " + res.toString());
	}
}

/*
Enter the String : mynameisnitikkumarsahaySSDrDD
Result String : mynaeistkurh
*/