package string;

/*
WAJP to take a String input and segregate alphabets and numeric digits in any order.
i/p: “a4cdx37d2b”
o/p: “bdxdca4372”
 
*/
import java.util.*;

public class SegragateNumericAndAlphabet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.next();
		sc.close();
		segragateNumAndAlph(str);
	}

	public static void segragateNumAndAlph(String str) {
		String result = "";
		int n = str.length();
		for (int i = 0; i < n; i++) {
			if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'))
				result = str.charAt(i) + result;
			else
				result = result + str.charAt(i);
		}
		System.out.println("Segragated String is : " + result);
	}
}
