package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * WAJP to rotate all the elements of array k position to its left.
 */
public class RotateLeftByKPosition {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of the Array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the positions to Left Rotate the Array : ");
		int k = sc.nextInt();
		k = k % n;
		System.out.println("Original Array : " + Arrays.toString(arr));
		System.out.println("Updated Array : " + Arrays.toString(rotateLeftByKPosition(arr, k)));
	}

	public static int[] rotateLeftByKPosition(int[] arr, int k) {
		int n = arr.length;
		reverseArray(arr, 0, n - 1);
		reverseArray(arr, 0, n - k - 1);
		reverseArray(arr, n - k, n - 1);
		return arr;
	}

	public static void reverseArray(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
