package loops.whileloop.whileloop3;

// Write a java program to take a String input and check whether the given String is a palindrome String or not.
import java.util.Scanner;

public class CheckPalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String name = sc.next();
		String revName = "";
		int i = name.length() - 1;
		while (i >= 0) {
			revName += name.charAt(i);
			i--;
		}
		System.out.println("Reverse of the : " + name + " is : " + revName);
		if (revName.equals(name)) {
			System.out.println("Palindrome String.");
		} else {
			System.out.println("Not a Palindrome String.");
		}
		sc.close();
	}

}
