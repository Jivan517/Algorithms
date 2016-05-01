package practice.algorithms;

import java.util.Arrays;

import practice.util.Utils;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 4, 2, 1, 3, 5 };
		System.out.println("Array original: " + Arrays.toString(arr));
		System.out.println("Array Sorted: " + Arrays.toString(selectionSort(arr)));

	}

	/*
	 * Proof that Loop Invariant holds. At the end of the i = 0 pass, the
	 * minimum element of the array has been placed in position 0, so I(0)
	 * holds. Assuming arr[0]..arr[i] are in final sorted order, as inner loop
	 * runs, the position pos of the smallest element among the elements
	 * arr[i+1], arr[i+2],..., arr[n-1] is obtained and arr[pos], arr[i+1] are
	 * swapped. Since arr[0]..arr[i] are already in sorted order, iteration i +
	 * 1 results in arr[0]..arr[i], arr[i+1] being in final sorted order.
	 */
	private static int[] selectionSort(int[] arr) {

		for (int i = 0; i < arr.length; ++i) {
			int minPos = Utils.minPos(arr, i, arr.length - 1);
			Utils.swap(arr, i, minPos);
		}

		return arr;
	}

}
