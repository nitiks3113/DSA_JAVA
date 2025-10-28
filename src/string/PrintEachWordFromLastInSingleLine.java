package string;

import java.util.*;

public class PrintEachWordFromLastInSingleLine {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		sc.close();
		String result = getRevWord(str);
		System.out.println(result);
	}

	public static String getRevWord(String s) {
		String[] words = s.split("\s+");
		String rev = "";
		for (int i = words.length - 1; i >= 0; i--) {
			rev = rev + words[i] + " ";
		}
		return rev.trim();
	}
}


/*

Enter the String : 
My name is Nitik Kumar Sahay
Sahay Kumar Nitik is name My

*/