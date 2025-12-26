package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P35_CheckElements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the first Array : ");
		int n1 = sc.nextInt();
		System.out.print("Enter the size of the second Array : ");
		int n2 = sc.nextInt();

		if (n1 != n2) {
			System.out.println("Both arrays are not same.");
			sc.close();
			return;
		}

		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];

		System.out.println("Enter the elements in the Array 1 : ");

		for (int i = 0; i < n1; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println("Enter the elements in the Array 2 : ");
		for (int i = 0; i < n2; i++) {
			arr2[i] = sc.nextInt();
		}

		System.out.println("Array 1 : " + Arrays.toString(arr1));
		System.out.println("Array 2 : " + Arrays.toString(arr2));
		if (checkElements(arr1, arr2)) {
			System.out.println("True : Both array have same element.");
		} else {
			System.out.println("False : Both array doesn't have same element.");
		}

		sc.close();

	}

	public static boolean checkElements(int[] arr1, int[] arr2) {
		int n1 = arr1.length;
		bubbleSort(arr1);
		bubbleSort(arr2);

		for (int i = 0; i < n1; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			boolean swap = false;
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swap = true;
				}
			}

			if (!swap) {
				break;
			}
		}
	}
}
