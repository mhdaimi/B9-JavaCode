package date18042021;

import java.util.ArrayList;
import java.util.HashSet;

public class SetExample {

	public static void main(String[] args) {

		
		HashSet<String> cities = new HashSet<String>();
		
		cities.add("Java");
		cities.add("Python");
		cities.add("JavaScript");
		cities.add("Java");
		
		System.out.println(cities);
		
		ArrayList<String> progLanguage = new ArrayList<String>();
		
		progLanguage.add("Java");
		progLanguage.add("Python");
		progLanguage.add("JavaScript");
		progLanguage.add("Java");
		
		System.out.println(progLanguage);
		
		HashSet<String> lang = new HashSet<String>();
		
		lang.addAll(progLanguage);
		
		System.out.println(lang);
		
		
		for (String val : lang) {
			System.out.println(val);
		}
		
		
	}

}
