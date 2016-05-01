package practice.util;

public class Utils {
	public static int[] swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

		return arr;
	}
	
	public static int minPos(int[] arr, int bottom, int top){
		
		int min = arr[bottom];
		int index = bottom;
		for(int i = bottom + 1; i <= top; i++){
			if(arr[i] < min){
				min = arr[i];
				index = i;
			}
		}
		
		return index;
	}
}
