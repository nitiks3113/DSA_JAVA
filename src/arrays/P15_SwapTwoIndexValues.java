package arrays;

/**
 * WAJP to swap two index values of the array.
 */

import java.util.*;

public class P15_SwapTwoIndexValues {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements in the array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the first index : ");
		int index1 = sc.nextInt();
		System.out.println("Enter the second index : ");
		int index2 = sc.nextInt();
		System.out.println(Arrays.toString(swapIndexValues(arr, index1, index2)));
		sc.close();
	}

	public static int[] swapIndexValues(int[] arr, int index1, int index2) {

		if (index1 < 0 || index1 >= arr.length || index2 < 0 || index2 >= arr.length) {
			System.out.println("Invalid index value.");
			return arr;
		}

		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;

		return arr;
	}
}
