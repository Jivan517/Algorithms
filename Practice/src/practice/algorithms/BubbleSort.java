package practice.algorithms;

import java.util.Arrays;

import practice.util.Utils;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = new int[] { 4, 2, 1, 3, 5 };
		System.out.println("Array original: " + Arrays.toString(arr));
		System.out.println("Array Sorted: " + Arrays.toString(bubbleSort(arr)));

	}

	//Certainly I(0) is true (when
	/*
	 * i=0 pass completes, largest element has been placed at the end). Assume
	 * I(i) holds; we show arr[n-i-2]..arr[n-1] are in final sorted order. As
	 * inner loop runs, the largest element max among the elements arr[0],
	 * arr[1],..., arr[n-i-2] is pushed to the right as far as possible. Since
	 * the elements arr[n-i-1] through arr[n-1] are in final sorted order, max
	 * is not pushed into any of those final slots. Therefore, it is placed in
	 * slot n-i-2.
	 */
	/**
	 * 
	 * @param arr
	 * @return
	 */
	private static int[] bubbleSort(int[] arr) {

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length-1; j++){
				if(arr[j] > arr[j+1]){
					Utils.swap(arr, j, j+1);
				}
			}
		}
		return arr;
	}

}
