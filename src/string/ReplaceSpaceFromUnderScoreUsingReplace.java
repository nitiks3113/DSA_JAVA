package string;

import java.util.*;

public class ReplaceSpaceFromUnderScoreUsingReplace {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		sc.close();
		String res = str.replace(' ', '_');
		System.out.println("Result : " + res);
	}
}

/*
Enter the String : My Name is Nitik Kumar Sahay
Result : My_Name_is_Nitik_Kumar_Sahay
*/