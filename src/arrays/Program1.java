package arrays;

/**
 * WAJP to swap two arrays.
 */

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the first array : ");
		int a1 = sc.nextInt();
		System.out.print("Enter the size of the second array : ");
		int a2 = sc.nextInt();
		int[] arr1 = new int[a1];
		int[] arr2 = new int[a2];

		System.out.println("Enter the elements in first array : ");
		for (int i = 0; i < a1; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println("Enter the elements in the second array : ");
		for (int i = 0; i < a2; i++) {
			arr2[i] = sc.nextInt();
		}
		System.out.println("Elements in the first array are : ");
		displayArr(arr1);
		System.out.println();
		System.out.println("Elements in the second array are : ");
		displayArr(arr2);
		System.out.println();
		swapArr(arr1, arr2);
	}

	public static void displayArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",  ");
		}
	}

	public static void swapArr(int[] arr1, int[] arr2) {

		int a1 = arr1.length;
		int a2 = arr2.length;

		if (a1 != a2) {
			System.out.println("Can't swap!");
			return;
		}

		for (int i = 0; i < a1; i++) {
			int temp = arr1[i];
			arr1[i] = arr2[i];
			arr2[i] = temp;
		}

		System.out.println("After swapping arr1 : ");
		displayArr(arr1);
		System.out.println();
		System.out.println("After swapping arr2 : ");
		displayArr(arr2);
	}
}
