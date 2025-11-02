package string;

/*
 * WAJP to print all the character of the String exactly once(consider only alphabets in Uppercase)
*/
import java.util.*;

public class RemoveDuplicatesConsiderUpperCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.next();
		sc.close();
		removeDuplicates(str);
	}

	public static void removeDuplicates(String str) {
		StringBuilder res = new StringBuilder("");
		for (char c : str.toCharArray()) {
			if (c >= 'A' && c <= 'Z') {
				if (res.indexOf(String.valueOf(c)) == -1)
					res = res.append(c);
			}
		}
		System.out.println("Result String : " + res.toString());
	}
}

/*
Enter the String : myNameIsNitikKumarSAHAy
Result String : NIKSAH
*/