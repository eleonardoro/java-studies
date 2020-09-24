package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Map<Integer, String> months = new HashMap<>();
		
		months.put(1,  "January");
		months.put(2,  "February");
		months.put(3,  "March");
		months.put(12,  "December");
		
		System.out.println(months);
		
		String m1 = months.get(1);
		System.out.println(m1);
		
		m1 = months.get(5);
		System.out.println(m1);
		
		Set<Integer> numbers = months.keySet();
		System.out.println(numbers);
		
		Collection<String> names = months.values();
		System.out.println(names);
		
		Set<Map.Entry<Integer, String>> entries = months.entrySet();
		System.out.println(entries);
		
		for(Map.Entry<Integer, String> entry : entries)
			System.out.println(entry.getKey() + " / " + entry.getValue());
	}

}
