package string;

/*
 WAJP to take a String input and replace all the space characters from _ in the String.
a)By using replace() method
b)Without using replace() method
*/
import java.util.*;

public class ReplaceSpaceFromUnderScore {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		sc.close();
		getString(str);
	}

	public static void getString(String str) {
		StringBuilder res = new StringBuilder("");
		for (char c : str.toCharArray()) {
			if (c != ' ')
				res = res.append(c);
			else if (c == ' ')
				res = res.append("_");
		}
		System.out.println("Result : " + res.toString());
	}
}

/*
Enter the String : My Name is Nitik Kumar Sahay
Result : My_Name_is_Nitik_Kumar_Sahay
*/