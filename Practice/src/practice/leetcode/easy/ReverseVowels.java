package practice.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/*Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".*/
		
public class ReverseVowels {

	public static String reverseVowels(String s) {
		
		List<Character> vowList = new ArrayList<>();
		vowList.add('a');
		vowList.add('e');
		vowList.add('i');
		vowList.add('o');
		vowList.add('u');
		vowList.add('A');
		vowList.add('E');
		vowList.add('I');
		vowList.add('O');
		vowList.add('U');

		char[] arr = s.toCharArray();

		int i = 0;
		int j = s.length() - 1;

		while (i < j) {
			if (!vowList.contains(arr[i])) {
				i++;
				continue;
			}

			if (!vowList.contains(arr[j])) {
				j--;
				continue;
			}

			char t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;

			i++;
			j--;
		}

		return new String(arr);

	}

	public static void main(String[] args) {
		
		System.out.println("Reverse of 'Jivan': " + reverseVowels("Jivan"));
	}

}
