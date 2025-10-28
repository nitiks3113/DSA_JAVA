package string;

import java.util.*;

public class PrintEachWordInReverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		sc.close();
		printReverseWord(str);
	}

	public static void printReverseWord(String s) {
		String[] words = s.split("\s+");

		for (String word : words) {
			String rev = "";
			for (int i = 0; i < word.length(); i++) {
				rev = word.charAt(i) + rev;
			}
			System.out.println(rev + " ");
		}
	}
}
