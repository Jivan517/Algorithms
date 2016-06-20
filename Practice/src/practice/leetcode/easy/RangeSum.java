package practice.leetcode.easy;

import java.util.Arrays;

/*
Given an integer array nums, find the sum of the elements between indices i and j (i <= j), inclusive.

Example:
Given nums = [-2, 0, 3, -5, 2, -1]

sumRange(0, 2) -> 1
sumRange(2, 5) -> -1
sumRange(0, 5) -> -3
Note:
You may assume that the array does not change.
There are many calls to sumRange function.*/

public class RangeSum {

	long[] sums; 

	public RangeSum(int[] nums) {
	    sums = new long[nums.length]; 
	    long sum = 0;
	    for(int i = 0; i < nums.length; i++) {
	        sum += nums[i]; 
	        sums[i] = sum;     
	    }
	}

	public int sumRange(int i, int j) {
		
	    if(i < 0 || j >= sums.length) throw new RuntimeException("out of nums range."); 
	    return (int)((i==0)? sums[j] : sums[j] - sums[i-1]);  
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {4, 2, 8, 6,78};
		RangeSum rs = new RangeSum(arr);
		System.out.println("Array: " + Arrays.toString(arr));
		System.out.println("Range Sum between 1 & 3: " + rs.sumRange(1, 3));

	}

	
}
