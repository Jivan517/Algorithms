package practice.leetcode.medium;

import java.util.*;
import java.util.Map.Entry;

/*Given an array of strings, group anagrams together.

For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
Return:

[
  ["ate", "eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:
For the return value, each inner list's elements must follow the lexicographic order.
All inputs will be in lower-case.

*/
public class GroupAnagram {

	 public static List<List<String>> groupAnagrams(String[] list) {
	        Map<Integer, List<String>> hm = new HashMap<Integer, List<String>> ();
			
			for (int x = 0; x < list.length; x++) {
				if (list[x] == null)
					continue;

				String curX = list[x];
				int hashX = primeHash(curX);

				hm.put(hashX, new ArrayList<>(Arrays.asList(curX)));

				for (int y = x + 1; y < list.length; y++) {

					String curY = list[y];
					int hashY = primeHash(curY);

					if (curY == null || curY.length() != curX.length())
						continue;

					if (hashX == hashY) {
						hm.get(hashX).add(curY);

						list[y] = null; // if its an anagram null it out to avoid
										// checking again
					}
				}
			}
			List<List<String>> result = new ArrayList<>();
			for(Entry<Integer, List<String>> entry : hm.entrySet()){
				result.add(entry.getValue());
			}
			
			return result;
	    }

	// Utility Mehthods

	public static int primeHash(String word) {
		if (word == null)
			return 0;
		//System.out.println(word);
		//return word.hashCode();
		int productOfPrimes = 1;
		int prime[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
				101 };

		
		for (char ch : word.toCharArray()) {
		
			//System.out.println(ch);
			//System.out.println((int)ch);
			productOfPrimes *= prime[(int) ch - (int) 'a'];
		}
		return productOfPrimes;
	}

//	public static List<List<String>> groupAnagrams(String[] strs) {
//
//		String[] words = new String[strs.length];
//		words = strs;
//
//		int[] indices = new int[strs.length];
//		for (int i = 0; i < indices.length; i++) {
//			indices[i] = i;
//		}
//
//		for (int i = 0; i < strs.length; i++) {
//			char[] word = words[i].toCharArray();
//			Arrays.sort(word);
//			words[i] = word.toString();
//		}
//
//		Arrays.sort(words);
//		List<List<String>> result = new ArrayList<>();
//		List<String> list = new ArrayList<>();
//		String prevWord = words[0];
//		list.add(strs[0]);
//		for (int i = 1; i < words.length; i++) {
//
//		}
//	}

	public static void main(String[] args) {
		
		List<List<String>> maps = groupAnagrams( new String[] {"nozzle","punjabi","waterlogged","imprison","crux", "nolezz"});
        
		for(List<String> entry : maps)
		{
			System.out.println(entry);
		}
	}

}
