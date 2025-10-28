package string;

import java.util.*;

public class PrintEachWordFromLast {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		sc.close();
		printFromLastWord(str);
	}

	public static void printFromLastWord(String s) {
		String[] words = s.split("\s+");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.println(words[i] + " ");
		}
	}
}
