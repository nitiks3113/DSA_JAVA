package arrays;

/**
 * WAJP to insert an element at certain position of the array.
 */

import java.util.*;

public class P21_InsertElementAtCertainPosition {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the index : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements in the array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter the index to insert the element : ");
		int index = sc.nextInt();
		System.out.print("Enter the element to insert : ");
		int element = sc.nextInt();

		System.out.println("Original Array : " + Arrays.toString(arr));
		System.out.println("Updated Array : " + Arrays.toString(insertElementAtCertainPosition(arr, index, element)));
		sc.close();
	}

	public static int[] insertElementAtCertainPosition(int[] arr, int index, int element) {
		int n = arr.length;

		if (index < 0 || index > arr.length) {
			System.out.println("Enter a valid index.");
			return arr;
		}
		int[] updatedArray = new int[n + 1];
		for (int i = 0, j = 0; i < updatedArray.length; i++) {
			if (i < index) {
				updatedArray[i] = arr[j++];
			} else if (i == index) {
				updatedArray[i] = element;
			} else if (i > index) {
				updatedArray[i] = arr[j++];
			}
		}

		return updatedArray;
	}
}
