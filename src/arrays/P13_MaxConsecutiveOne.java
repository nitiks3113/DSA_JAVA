package arrays;

/**
 * Max consecutive 1 in any array
 */

import java.util.*;

public class P13_MaxConsecutiveOne {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements in the array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Maximum Consecutive ones in the array is : " + maxConsecutiveOne(arr));
	}

	public static int maxConsecutiveOne(int[] arr) {
		int n = arr.length;
		int currLen = 0;
		int maxLen = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 1) {
				currLen++;
				if (currLen >= maxLen)
					maxLen = currLen;
			} else if (arr[i] != 1)
				currLen = 0;
		}
		return maxLen;
	}
}
