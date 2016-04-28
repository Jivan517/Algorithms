package code;

import java.util.*;

public class Powerset {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(1, 3, 5);
		System.out.println("Powerset of " + Arrays.toString(arr.toArray()) + " are: " + powerSet(arr));

	}

	
	private static <T> List<Set<T>> powerSet(List<T> x) {
		List<Set<T>> p = new ArrayList<Set<T>>();
		if (x.isEmpty()) {
			p.add(new HashSet<T>());
			return p;
		}
		List<T> list = new ArrayList<T>(x);
		T f = list.get(0);
		List<T> rest = list.subList(1, list.size());
		for (Set<T> set : powerSet(rest)) {
			Set<T> t = new HashSet<T>();
			t.add(f);
			t.addAll(set);
			p.add(t);
			p.add(set);
		}
		return p;
	}
	
	
//	private static <T> List<Set<T>> powerSet1(List<T> x) {
//
//		List<Set<T>> p = new ArrayList<Set<T>>();
//		List<Set<T>> pTemp = new ArrayList<Set<T>>();
//		Set<T> s = new HashSet<T>();
//		p.add(s);
//		Set<T> t = new HashSet<T>();
//		int counter = 0;
//		Iterator<T> itr = x.iterator();
//
//		while (itr.hasNext()) {
//			T f = itr.next();
//			for (Set<T> element : p) {
//				Set<T> temp = new HashSet<T>();
//				temp.addAll(element);
//				temp.add(f);
//				t = temp;
//				pTemp.add(t);
//			}
//
//			counter++;
//		}
//
//		return pTemp;
//
//	}

	
}
