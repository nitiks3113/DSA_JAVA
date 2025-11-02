package string;

/*
 * WAJP to print the frequency of each character of the String.
*/
import java.util.*;

public class PrintFrequency {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		sc.close();
		printFrequency(str);
	}

	public static void printFrequency(String str) {
		int[] freq = new int[256];
		boolean[] printed = new boolean[256];
		for (char c : str.toCharArray())
			freq[c]++;
// Without preserving order
//		for (int i = 0; i < freq.length; i++) {
//			if (freq[i] > 0) {
//				System.out.println((char) i + " : " + freq[i]);
//			}
//		}
		// To Preserve Order
		for (char c : str.toCharArray()) {
			if (!printed[c]) {
				System.out.println(c + " : " + freq[c]);
				printed[c] = true;
			}
		}
	}
}

/*
 * Enter the String : My Name is Nitik Kumar Sahay : 5 K : 1 M : 1 N : 2 S : 1 a
 * : 4 e : 1 h : 1 i : 3 k : 1 m : 2 r : 1 s : 1 t : 1 u : 1 y : 2
 */



// To Preserve order : 

/*
Enter the String : My Name is Nitik Kumar Sahay
M : 1
y : 2
  : 5
N : 2
a : 4
m : 2
e : 1
i : 3
s : 1
t : 1
k : 1
K : 1
u : 1
r : 1
S : 1
h : 1
*/