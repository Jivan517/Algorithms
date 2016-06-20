package practice.leetcode.easy;

import java.util.*;

/*Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

Note:
Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.
Follow up:
What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to num2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
		
		*/
public class InersectionOfArraysII {
	public static int[] intersect(int[] nums1, int[] nums2) {

		int count = 0;
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < (nums2.length - count); j++) {
				if (nums1[i] == nums2[j]) {
					result.add(nums1[i]);

					int temp = nums2[nums2.length - 1 - count];
					nums2[nums2.length - 1 - count] = nums2[j];
					nums2[j] = temp;
					count++;

					break;
				}
			}
		}

		Iterator<Integer> itr = result.iterator();
		int i = 0;
		int[] arr = new int[result.size()];
		while (itr.hasNext()) {
			arr[i] = itr.next();
			i++;
		}

		return arr;
	}

	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 2 ,1};
		int[] arr2 = new int[] { 2,2 };
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(intersect(arr1, arr2)));

	}

}
