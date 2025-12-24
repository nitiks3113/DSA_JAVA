package sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Bubble Sort
 */
public class BubbleSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Array : ");
		int n = sc.nextInt();

		if (n <= 0) {
			System.out.println("Enter a positive size...");
			sc.close();
			return;
		}
		int[] arr = new int[n];
		System.out.println("Enter the elements in the Array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Original Array : " + Arrays.toString(arr));
		System.out.println("Sorted Array : " + Arrays.toString(bubbleSort(arr)));
		sc.close();
	}

	public static int[] bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int flag = 0;
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}
		}
		return arr;
	}
}

//Best Case: O(n)
//Average/Worst Case: O(n^2)
//Space Complexity: O(1)
//Stable Sort
