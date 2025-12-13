package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * WAJP to rotate all the elements of array k position to its right.
 */
public class P23_RotateRightByKPosition {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of the Array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements in the Array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter the number of positions to rotate : ");
		int k = sc.nextInt();
		System.out.println("Original Array : " + Arrays.toString(arr));
		System.out.println("Updated Array : " + Arrays.toString(rotateByKPosition(arr, k)));
	}

	public static int[] rotateByKPosition(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		reverseArr(arr, 0, n - 1);
		reverseArr(arr, 0, k - 1);
		reverseArr(arr, k, n - 1);
		return arr;
	}

	public static int[] reverseArr(int[] arr, int start, int end) {

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
