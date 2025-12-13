package arrays;

/**
 * WAJP to rotate each element of an array by one position in right side.
 */
import java.util.Arrays;
import java.util.Scanner;

public class P22_RotateRightByOnePosition {

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
		System.out.println("Updated Array : " + Arrays.toString(rightRotateByOne(arr)));
	}

	public static int[] rightRotateByOne(int[] arr) {
	    int n = arr.length;

	    int temp = arr[n - 1];

	    for (int i = n - 1; i > 0; i--) {
	        arr[i] = arr[i - 1];
	    }

	    arr[0] = temp;
	    return arr;
	}

	/*
	public static int[] rightRotateByOne(int[] arr) {
		int n = arr.length;
		int[] updatedArr = new int[n];
		int temp = arr[n - 1];
		for (int i = 0; i < n - 1; i++) {
			updatedArr[i + 1] = arr[i];
		}
		updatedArr[0] = temp;
		return updatedArr;
	}
	*/
}
