package date18042021;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {

		ArrayList<String> progLanguage = new ArrayList<String>();
		
		progLanguage.add("Java");
		progLanguage.add("Python");
		progLanguage.add("JavaScript");
		progLanguage.add("Java");
		progLanguage.add("C");
		progLanguage.add("C++");
		progLanguage.add("C#");
		progLanguage.add("COBOL");
		
		System.out.println(progLanguage);
		System.out.println(progLanguage.get(2));
		System.out.println(progLanguage.size());
		System.out.println(progLanguage.contains("Java"));
		System.out.println(progLanguage.contains("java"));
		System.out.println(progLanguage.indexOf("Python"));
		System.out.println(progLanguage.lastIndexOf("Java"));
		progLanguage.remove("Java");
		System.out.println(progLanguage);
		List<String> newList = progLanguage.subList(2, 6);
		System.out.println(newList);
		
		for(int i=0; i<progLanguage.size(); i++) {
			System.out.println(i + " -> " + progLanguage.get(i));
		}
		
		for ( String val  : progLanguage ) {
			System.out.println(val);
		}
		
	}

}
