package arrays;

/**
 * WAJP to remove an element from the certain position of the array.
 */

import java.util.*;

public class P19_RemoveElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements in the array : ");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the index to remove the element : ");
		int index = sc.nextInt();

		System.out.println("The current array is : " + Arrays.toString(arr));
		System.out.println("The updated array is : " + Arrays.toString(removeElement(arr, index)));
	}

	public static int[] removeElement(int[] arr, int index) {

		if (index < 0 || index >= arr.length) {
			System.out.println("Invalid position!");
			return arr;
		}

		int[] updatedArray = new int[arr.length - 1];
		for (int i = 0, j = 0; i < arr.length; i++) {
			if (i == index)
				continue;
			updatedArray[j++] = arr[i];
		}
		return updatedArray;
	}
}
