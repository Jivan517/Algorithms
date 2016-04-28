package code;

import java.util.Arrays;

public class Merge {

	public static void main(String[] args) {
		int[] ar1 = new int[] {2, 3, 5};
		int[] ar2 = new int[] {1,5,6,8};
		
		System.out.println("Array1: " + Arrays.toString(ar1));
		System.out.println("Array2: " + Arrays.toString(ar2));
		System.out.println("Merged Array: " + Arrays.toString(merge(ar1,ar2)));

	}

	
	private static int[] merge(int[] arr1, int[] arr2){
		
		int indexA = 0;
		int indexB = 0;
		int indexC = 0;
		
		int[] arr3 = new int[arr1.length + arr2.length];
		while(indexA < arr1.length && indexB < arr2.length){
			
			if(arr1[indexA] < arr2[indexB]){
				arr3[indexC]  = arr1[indexA];
				indexA++;
				
			}
			else{
				arr3[indexC] = arr2[indexB];
				indexB++;
				
			}
			
			indexC++;
			
		}
		
		if(indexA < arr1.length){
			for(int i = indexA; i < arr1.length; i++){
				arr3[indexC] = arr1[i];
				indexC++;
				
			}
			
		}
		
		if(indexB < arr2.length){
			for(int i = indexB; i < arr2.length; i++){
				arr3[indexC] = arr2[i];
				indexC++;
				
			}
			
		}
		
		
		return arr3;
		
	}
}
