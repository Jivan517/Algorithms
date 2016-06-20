package practice.leetcode.easy;

import java.util.*;

/*Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:
Each element in the result must be unique.
The result can be in any order.
*/
public class InterSectionOfArrays {

	public static int[] intersection(int[] nums1, int[] nums2) {

		Set<Integer> result = new HashSet<>();
		for(int i = 0; i < nums1.length; i++){
			for(int j = 0; j < nums2.length; j++){
				if(nums1[i] == nums2[j]){
					result.add(nums1[i]);
				}
			}
		}
		
		Iterator<Integer> itr = result.iterator();
		int i = 0;
		int[] arr = new int[result.size()];
		while(itr.hasNext()){
			arr[i] = itr.next();
			i++;
		}
		
		
		return arr;
	}

	public static void main(String[] args) {
		int[] arr1  = new int [] {1, 2};
		int[] arr2 =  new int[]{2,1};
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(intersection(arr1, arr2)));

	}

}
