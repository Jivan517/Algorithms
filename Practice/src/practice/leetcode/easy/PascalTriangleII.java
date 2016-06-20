package practice.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].

Note:
Could you optimize your algorithm to use only O(k) extra space?
		*/
public class PascalTriangleII {

	public static List<Integer> getRow(int rowIndex) {

		List<Integer> previousRow = new ArrayList<>(Arrays.asList(1));
		if (rowIndex == 0)
			return previousRow;

		for (int i = 2; i <= rowIndex + 1; i++) {
			List<Integer> currentRow = new ArrayList<>();
			currentRow.add(1); // first element
			for (int j = 0; j < previousRow.size() - 1; j++) {
				currentRow.add(previousRow.get(j) + previousRow.get(j + 1)); // middle
																				// elements
			}
			currentRow.add(1);// last element
			previousRow = currentRow;
		}

		return previousRow;
	}

	public static void main(String[] args) {
		System.out.println(getRow(4));
	}

}
