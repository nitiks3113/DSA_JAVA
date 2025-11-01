package string;

import java.util.*;

public class MergeTwoStringsAlternatively {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First String : ");
		String str1 = sc.next();
		System.out.print("Enter the Second String : ");
		String str2 = sc.next();
		sc.close();
		mergeStrings(str1, str2);
	}

	public static void mergeStrings(String str1, String str2) {
		StringBuilder res = new StringBuilder("");
		int n = str1.length();
		int m = str2.length();
		for (int i = 0; i < n || i < m; i++) {
			if (i < n)
				res.append(str1.charAt(i));
			if (i < m)
				res.append(str2.charAt(i));
		}
		System.out.println("Result : " + res.toString());
	}
}

/*
Enter the First String : Nitik
Enter the Second String : Suraj
Result : NSiutriakj
*/