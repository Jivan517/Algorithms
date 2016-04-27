package cs544.algorithm;

import java.util.*;
import java.util.stream.Collectors;

public class SubSetSum {

	public static void main(String[] args) {
		System.out
				.println("[bruteforce] Subset for 10: " + Arrays.toString(bruteForce(new int[] { 1, 3, 6, 9, 5 }, 10)));

		System.out.println(
				"[bruteforce] Subset for 10: " + Arrays.toString(bruteForce(new int[] { 1, 2, 5, 23, 4 }, 10)));

		System.out.println("[greedy] Subset for 10: " + Arrays.toString(greedy(new int[] { 1, 3, 6, 9, 10 }, 10)));

		System.out.println("[greedy] Subset for 10: " + Arrays.toString(greedy(new int[] { 1, 8, 5, 23, 4 }, 10)));

	}

	private static int[] bruteForce(int[] s, int k) {
		if (k == 0)
			return new int[] {};

		Set<Integer> originalSet = Arrays.stream(s).boxed().collect(Collectors.toSet());
		for (Set<Integer> set : powerSet(originalSet)) {
			int sum = 0;
			Iterator<Integer> itr = set.iterator();
			while (itr.hasNext()) {
				sum += itr.next();
			}

			if (sum == k) {
				List<Integer> arr = set.stream().collect(Collectors.toList());
				return arr.stream().mapToInt(i -> i).toArray();
			}
		}

		return null;
	}

	// It doesn't work if the subset for sum is not from continuous elements in
	// sorted array e.g. {1, 2, 14, 4, 5} for sum 10
	private static int[] greedy(int[] s, int k) {

		if (k == 0)
			return new int[] {};

		if (s.length < 1 && k > 0)
			return null;
		int[] sortedArray = sort(s);

		List<Integer> list = new ArrayList<>();
		int sum = 0;
		for (int i = 0; i < sortedArray.length; i++) {
			if (sum + sortedArray[i] <= k) {
				list.add(sortedArray[i]);
				sum += sortedArray[i];
				if (sum == k)
					return list.stream().mapToInt(val -> val).toArray();
				if (sum > k)
					return null;
			}
		}

		return null;
	}

	private static Set<Set<Integer>> powerSet(Set<Integer> originalSet) {
		Set<Set<Integer>> sets = new HashSet<Set<Integer>>();
		if (originalSet.isEmpty()) {
			sets.add(new HashSet<Integer>());
			return sets;
		}
		List<Integer> list = new ArrayList<Integer>(originalSet);
		Integer head = list.get(0);
		Set<Integer> rest = new HashSet<Integer>(list.subList(1, list.size()));
		for (Set<Integer> set : powerSet(rest)) {
			Set<Integer> newSet = new HashSet<Integer>();
			newSet.add(head);
			newSet.addAll(set);
			sets.add(newSet);
			sets.add(set);
		}
		return sets;
	}

	private static int[] sort(int[] arr) {
		Arrays.parallelSort(arr);

		return arr;
	}

}
