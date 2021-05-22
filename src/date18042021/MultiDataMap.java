package date18042021;

import java.util.ArrayList;
import java.util.HashMap;

public class MultiDataMap {

	public static void main(String[] args) {

		
		HashMap<Integer, ArrayList<String>> data = new HashMap<Integer, ArrayList<String>>();
		
		ArrayList<String> d1 = new ArrayList<String>();
		ArrayList<String> d2 = new ArrayList<String>();
		ArrayList<String> d3 = new ArrayList<String>();
		ArrayList<String> d4 = new ArrayList<String>();
		
		d1.add("Zero");
		d1.add("zero");
		d1.add("0");
		
		d2.add("One");
		d2.add("one");
		
		d3.add("Two");
		d3.add("two");
		d3.add("2");
		
		d4.add("Three");
		d4.add("three");
		
		data.put(0, d1);
		data.put(1, d2);
		data.put(2, d3);
		data.put(3, d4);
		
		
		System.out.println(data);
		
		System.out.println(data.get(2).get(1));
		
		System.out.println(data.get(3).get(0));
		
	}

}
