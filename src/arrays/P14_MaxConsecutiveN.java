package arrays;

/**
 * Max consecutive n in any array
 */

import java.util.*;

public class P14_MaxConsecutiveN {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements in the array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the target element : ");
		int target = sc.nextInt();

		maxConsecutiveN(arr, target);
	}

	public static void maxConsecutiveN(int[] arr, int target) {
		int n = arr.length;
		int currLen = 0;
		int maxLen = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] == target) {
				currLen++;
				if (currLen >= maxLen)
					maxLen = currLen;
			} else if (arr[i] != target) {
				currLen = 0;
			}
		}

		System.out.println("The max consecutive " + target + " in the array is : " + maxLen);
	}
}
