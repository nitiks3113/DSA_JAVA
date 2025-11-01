package string;

/*
 * Write a java program to print the biggest numeric character from the given string.
Return -1 if there is no numeric characters.
*/
import java.util.*;

public class ReturnBiggestNumericCharacter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		sc.close();
		biggestNumber(str);
	}

	public static void biggestNumber(String str) {
		int bigNum = -1;
		for (char c : str.toCharArray()) {
			if (c >= '0' && c <= '9') {
				int num = c - 48;
				if (num > bigNum)
					bigNum = num;
			}
		}
		System.out.println("Biggest Numeric Character is : " + bigNum);
	}
}
