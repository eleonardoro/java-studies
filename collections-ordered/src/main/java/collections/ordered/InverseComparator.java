package collections.ordered;

import java.util.Comparator;

public class InverseComparator implements Comparator<Character>{

	@Override
	public int compare(Character c1, Character c2) {
		return -c1.compareTo(c2);
	}
}
