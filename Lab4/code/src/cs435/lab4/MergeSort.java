package cs435.lab4;

import java.util.Arrays;

public class MergeSort {
	private static int[] theArray;

	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		ms.runMergeTest();
	}

	public void runMergeTest() {

		double prevTime = System.currentTimeMillis();

		int[] arr = new int[] { 4, 2, 1, 3, 5, 0, 34, 23, 4334, 454, 23, 34, 6, 3, 34, 6, 4556, 43534, 65, 76, 4554, 34,
				456, 657, 678, 3453, 567, 86, 345, 67, 3453, 8645, 34, 0, 78, 45, 7877645, 23, 453, 343, 56, 6576, 768,
				456, 3, 567, 68 };
		System.out.println("Array original: " + Arrays.toString(arr));
		int[] sorted = sort(arr);
		double currentTime = System.currentTimeMillis();
		System.out.println(
				"[MERGE_SORT, time = " + (currentTime - prevTime) + " ms]	Array Sorted: " + Arrays.toString(sorted));

		prevTime = System.currentTimeMillis();
		int[] sortedArr = sortPlus(arr);
		currentTime = System.currentTimeMillis();
		System.out.println("[MEGE_SORT_PLUS, time = " + (currentTime - prevTime) + " ms]	Array Sorted: "
				+ Arrays.toString(sortedArr));
	}

	public int[] sort(int[] input) {
		theArray = input;
		int n = input.length;
		int[] tempStorage = new int[n];
		mergeSort(tempStorage, 0, n - 1);
		theArray = tempStorage;
		return theArray;

	}

	public int[] sortPlus(int[] input) {
		theArray = input;
		int n = input.length;
		int[] tempStorage = new int[n];
		mergeSortPlus(tempStorage, 0, n - 1);
		theArray = tempStorage;
		return theArray;

	}

	public void mergeSort(int[] temp, int lower, int upper) {
		if (lower == upper) {
			return;
		} else {

			int mid = (lower + upper) / 2;
			mergeSort(temp, lower, mid);
			mergeSort(temp, mid + 1, upper);
			merge(temp, lower, mid + 1, upper);
		}
	}

	public static void mergeSortPlus(int[] tempStorage, int lower, int upper) {

		if (lower == upper)
			return;

		if (upper - lower <= 20) {
			insertionSort(tempStorage, lower, upper);
		}

		else {

			int mid = (lower + upper) / 2;
			mergeSortPlus(tempStorage, lower, mid);
			mergeSortPlus(tempStorage, mid + 1, upper);
			merge(tempStorage, lower, mid + 1, upper);
		}
	}

	private static void insertionSort(int[] tempStorage, int lower, int upper) {

		for (int i = lower; i <= upper; i++) {
			int temp = theArray[i];

			int j = i;

			while (j > 0 && temp < theArray[j - 1]) {
				theArray[j] = theArray[j - 1];
				tempStorage[j] = theArray[j];
				j--;
			}

			theArray[j] = temp;
			tempStorage[j] = temp;
		}

	}

	public static void merge(int[] tempStorage, int lowerPointer, int upperPointer, int upperBound) {

		int j = 0;
		int lowerBound = lowerPointer;
		int n = upperBound - lowerBound + 1;
		int mid = upperPointer - 1;

		while (lowerPointer <= mid && upperPointer <= upperBound) {
			if (theArray[lowerPointer] <= theArray[upperPointer]) {
				tempStorage[j++] = theArray[lowerPointer++];
			} else {
				tempStorage[j++] = theArray[upperPointer++];
			}
		}

		while (lowerPointer <= mid) {
			tempStorage[j++] = theArray[lowerPointer++];
		}

		while (upperPointer <= upperBound) {
			tempStorage[j++] = theArray[upperPointer++];
		}

		for (j = 0; j < n; ++j) {
			theArray[lowerBound + j] = tempStorage[j];
		}
	}

}
