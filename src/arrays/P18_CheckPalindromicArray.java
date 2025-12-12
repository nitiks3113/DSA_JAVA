package arrays;

/**
 * WAJP to check array is a palindromic array or not. Return true or false
 * accordingly.
 */

import java.util.*;

public class P18_CheckPalindromicArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements in the array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The given array is palidrome : " + checkPalindromicArray(arr));
	}

	public static boolean checkPalindromicArray(int[] arr) {
		int n = arr.length;
		int start = 0;
		int end = n - 1;
		while (start < end) {
			if (arr[start] != arr[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
