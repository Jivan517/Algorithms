package code;

import java.util.Arrays;

public class BubbleSort1 {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("Array original: " + Arrays.toString(arr));
		System.out.println("Array Sorted: " + Arrays.toString(bubbleSortBestCase(arr)));
	}

	/**
	 * 
	 * @param arr
	 * @return
	 */
	// EXPLANATION:
	// In this case the array is already sorted, i.e., we are taking the best
	// case scenario. So, since the array is already sorted
	// the second loop will run n-times in the first pass but after that the
	// first loop will break as the alreadySorted flag will
	// always be true. So, the running time will be O(n).
	public static int[] bubbleSortBestCase(int[] arr) {

		boolean alreadySorted = true;
		for (int i = 0; i < arr.length; i++) {

			System.out.println("firstLoop");

			for (int j = 0; j < arr.length - 1; j++) {

				System.out.println("secondLoop");

				if (arr[j + 1] < arr[j]) {
					arr = swap(arr, j, j + 1);
					alreadySorted = false;
				}
			}

			if (alreadySorted)
				break;
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
