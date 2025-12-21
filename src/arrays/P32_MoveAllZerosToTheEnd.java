package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P32_MoveAllZerosToTheEnd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Array Elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is : " + Arrays.toString(arr));
		System.out.println("Updated Array is : " + Arrays.toString(moveZeroesToTheEnd(arr)));
		sc.close();
	}

	// without using extra space

	public static int[] moveZeroesToTheEnd(int[] arr) {
		int n = arr.length;
		int index = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
				index++;
			}
		}

		return arr;
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

//	public static int[] moveZeroesToTheEnd(int[] arr) {
//		int n = arr.length;
//		int[] res = new int[n];
//		int j = 0;
//		for (int i = 0; i < n; i++) {
//			if (arr[i] != 0) {
//				res[j++] = arr[i];
//			}
//		}
//		while (j < n) {
//			res[j++] = 0;
//		}
//
//		return res;
//	}

}
