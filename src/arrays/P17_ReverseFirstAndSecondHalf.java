package arrays;

/**
 * WAJP to reverse 1st half and 2nd half elements of array.
 */

import java.util.*;

public class P17_ReverseFirstAndSecondHalf {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements in the array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Resultant Array is : " + Arrays.toString(reverseFirstAndSecondHalf(arr)));
	}

	public static int[] reverseFirstAndSecondHalf(int[] arr) {
		int n = arr.length;
		int mid = n / 2;

		if (n % 2 == 0) {
			reverseArray(arr, 0, mid - 1);
			reverseArray(arr, mid, n - 1);

		} else {
			reverseArray(arr, 0, mid);
			reverseArray(arr, mid + 1, n - 1);
		}

		return arr;
	}

	public static int[] reverseArray(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;
	}
}
