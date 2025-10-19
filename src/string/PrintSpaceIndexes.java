package string;

// WAJP to take a String input and print all the indexes where space characters are present in the String.
import java.util.*;

public class PrintSpaceIndexes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string:");
		String str = sc.nextLine();
		sc.close();
		System.out.println("Indexes where spaces are present:");

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				System.out.print(i + " ");
			}
		}
	}

}
