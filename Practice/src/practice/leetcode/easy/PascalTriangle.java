package practice.leetcode.easy;

import java.util.*;

/*Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
		*/
public class PascalTriangle {

	public static List<List<Integer>> generate(int numRows) {

		List<List<Integer>> combinedList = new ArrayList<>();
		if (numRows <= 0)
			return combinedList;

		List<Integer> previousRow = new ArrayList<>(Arrays.asList(1));
		combinedList.add(previousRow);

		for (int i = 2; i <= numRows; i++) {
			List<Integer> currentRow = new ArrayList<>();

			currentRow.add(1); // first element
			for (int j = 0; j < previousRow.size() - 1; j++) {
				currentRow.add(previousRow.get(j) + previousRow.get(j + 1)); // middle
																				// elements
			}
			currentRow.add(1);// last element

			combinedList.add(currentRow);
			previousRow = currentRow;
		}

		return combinedList;

	}

	public static void main(String[] args) {

		System.out.println(generate(5));
	}

}
