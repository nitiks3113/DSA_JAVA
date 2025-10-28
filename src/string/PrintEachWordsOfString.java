package string;

import java.util.*;

public class PrintEachWordsOfString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		printWord(str);
		sc.close();
	}

	public static void printWord(String s) {
		String[] words = s.split("\s+");

		for (String word : words) {
			System.out.println(word);
		}
	}
}
