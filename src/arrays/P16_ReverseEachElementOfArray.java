package arrays;

/**
 * WAJP to reverse each element of the array.
 */

import java.util.*;

public class P16_ReverseEachElementOfArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the element in the array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(reverseEachElement(arr)));
	}

	public static int[] reverseEachElement(int[] arr) {
		int n = arr.length;
		int start = 0;
		int end = n - 1;
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
