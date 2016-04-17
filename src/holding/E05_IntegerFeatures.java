package holding;

import java.util.*;
import static operators.SimplePrint.*;

public class E05_IntegerFeatures {
	public static void main(String[] args) {
		Random rand = new Random(47);
		
		List<Integer> ints = new ArrayList<Integer>(
				Arrays.asList(0,1,2,3,4,5,6,7,8)
				);
		
		print("1: " + ints);
		
		ints.add(9); // Automatically resizes
		print("2: " + ints);
		print("3: " + ints.contains(0));
		ints.remove(9); // Remove by object
		Integer i = ints.get(2);
		print("4: " + i + " " + ints.indexOf(i));
		Integer j = Integer.valueOf(1);
		print("5: " + ints.indexOf(j));
		print("6: " + ints.remove(j));
		
		
		// Must be the exact object:
		print("7: " + ints.remove(i));
		print("8: " + ints);
		ints.add(3, 0); // Insert at an index
		print("9: " + ints);
		List<Integer> sub = ints.subList(1, 4);
		print("subList: " + sub);
		print("10: " + ints.containsAll(sub));
		Collections.sort(sub); // In-place sort
		print("sorted subList: " + sub);
		// Order is not important in containsAll():
		print("11: " + ints.containsAll(sub));
		Collections.shuffle(sub, rand); // Mix it up
		print("shuffled subList: " + sub);
		print("12: " + ints.containsAll(sub));
		List<Integer> copy = new ArrayList<Integer>(ints);
		sub = Arrays.asList(ints.get(1), ints.get(4));
		print("sub: " + sub);
		copy.retainAll(sub);
		print("13: " + copy);
		copy = new ArrayList<Integer>(ints); // Get a fresh copy
		copy.remove(2); // Remove by index
		print("14: " + copy);
		copy.removeAll(sub); // Only removes exact objects
		print("15: " + copy);
		copy.set(1, 9); // Replace an element
		print("16: " + copy);
		copy.addAll(2, sub); // Insert a list in the middle
		print("17: " + copy);
		print("18: " + ints.isEmpty());
		ints.clear(); // Remove all elements
		print("19: " + ints);
		print("20: " + ints.isEmpty());
		ints.addAll(Arrays.asList(1,2,3,4));
		print("21: " + ints);
		Object[] o = ints.toArray();
		print("22: " + o[3]);
		Integer[] pa = ints.toArray(new Integer[0]);
		print("23: " + pa[3]);

	}
}
