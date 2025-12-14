package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * WAJP to rotate each element of an array by one position in left side.
 */
public class P25_RotateLeftByOnePosition {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements in the Array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Original Array : " + Arrays.toString(arr));
		System.out.println("Updated Array : " + Arrays.toString(rotateLeftByOnePosition(arr)));
	}

	public static int[] rotateLeftByOnePosition(int[] arr) {
		int n = arr.length;
		int temp = arr[0];
		for (int i = 0; i < n - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[n - 1] = temp;

		return arr;
	}
}
