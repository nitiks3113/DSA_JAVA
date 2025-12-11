package arrays;

/**
 * For the given array of Strings, print and count all the Strings which has even number of characters.
 */
import java.util.*;

public class P5_PrintCountEvenStringCharacters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the String array : ");
		int n = sc.nextInt();
		String[] str = new String[n];
		System.out.println("Enter the elements in the String array :");
		for (int i = 0; i < n; i++) {
			str[i] = sc.next();
		}

		sc.close();
		countAndPrintEvenCharacters(str);
	}

	public static void countAndPrintEvenCharacters(String[] str) {
		int n = str.length;
		int countEven = 0;
		for (int i = 0; i < n; i++) {
			String s = str[i];
			int count = s.length();

			if (count % 2 == 0) {
				countEven++;
				System.out.println(s + " : " + count);
			}
		}
		System.out.println("Total number of Even Characters Strings : " + countEven);
	}
}
