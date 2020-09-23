package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> marketList = new ArrayList<>();
		
		marketList.add("Noodles");
		marketList.add("Beans");
		marketList.add("Salt");
		marketList.add("Eggs");
		
		System.out.println(marketList);
		
		System.out.println("\n\n");
		
		for (String item : marketList) {
			System.out.println(item);
		}
		
		System.out.println("\n\n");
		
		for (int i = 0; i < marketList.size(); i++) {
			System.out.println("Item " + i + " => " + marketList.get(i));
		}
		
		System.out.println("\n\nRemoving 0!\n");
		marketList.remove(0);
		
		for (int i = 0; i < marketList.size(); i++) {
			System.out.println("Item " + i + " => " + marketList.get(i));
		}

		System.out.println("\n\nFinding Salt!\n");
		int posSalt = marketList.indexOf("Salt");
		System.out.println("Salt in position " + posSalt);
		
		System.out.println("\n\nFinding Cake!\n");
		int posCake = marketList.indexOf("Cake");
		System.out.println("Salt in position " + posCake);
		
		System.out.println("\n\nOrdenating!\n");
		for (int i = 0; i < marketList.size(); i++) {
			System.out.println("Item " + i + " => " + marketList.get(i));
		}
		
		Collections.sort(marketList);
		
		System.out.println("\n");
		
		for (int i = 0; i < marketList.size(); i++) {
			System.out.println("Item " + i + " => " + marketList.get(i));
		}
		
	}

}
