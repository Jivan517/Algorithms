package code;

import java.util.Arrays;

public class BubbleSort1 {

	public static void main(String[] args) {

		int[] arr = new int[] {1, 2, 3, 4, 5};
		System.out.println("Array original: " + Arrays.toString(arr));
		System.out.println("Array Sorted: " + Arrays.toString(bubbleSortBestCase(arr)));
	}

	public static int[] bubbleSortBestCase(int[] arr) {

		boolean swapped = true;

		for (int i = 0; i < arr.length && swapped; i++) {
			swapped = false;
			System.out.println("firstLoop");
			for (int j = 0; j < arr.length - 1; j++) {
				System.out.println("secondLoop");
				if (arr[j + 1] < arr[j]) {
					arr = swap(arr, j, j + 1);
					swapped = true;
				}
			}
		}

		return arr;
	}

	private static int[] swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

		return arr;
	}
}
