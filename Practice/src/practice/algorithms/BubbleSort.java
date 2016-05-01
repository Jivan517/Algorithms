package practice.algorithms;

import java.util.Arrays;

import practice.util.Utils;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = new int[] { 4, 2, 1, 3, 5 };
		System.out.println("Array original: " + Arrays.toString(arr));
		System.out.println("Array Sorted: " + Arrays.toString(bubbleSort(arr)));

	}

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
