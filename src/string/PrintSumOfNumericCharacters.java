package string;

import java.util.*;

public class PrintSumOfNumericCharacters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		sc.close();
		printNumericSum(str);
	}

	public static void printNumericSum(String str) {
		int sum = 0;
		for (char c : str.toCharArray()) {
			int num = c - '0';
			if (c >= '0' && c <= '9') {
				sum = sum + num;
			}
		}
		System.out.println("Sum of digits is : " + sum);
	}
}

/*
Enter the String : MyNameIsNitik3113KumarSahay2603
Sum of digits is : 19
*/