package string;

import java.util.Scanner;

public class PrintEachWordFromLastInReverse {

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
			String rev = "";
			for (int j = 0; j < words[i].length(); j++) {
				rev = words[i].charAt(j) + rev;
			}
			System.out.println(rev);
		}
	}
}
