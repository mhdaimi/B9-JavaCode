package date18042021;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {

		
		HashMap<String, String> stateCapital = new HashMap<String, String>();
		
		stateCapital.put("Maharashtra", "Mumbai");
		stateCapital.put("Karnataka", "Bangalore");
		stateCapital.put("Goa", "Panjim");
		
		System.out.println(stateCapital);
		
		stateCapital.put("Maharashtra", "Aurangabad");
		
		System.out.println(stateCapital);
		
		System.out.println(stateCapital.get("Karnataka"));
		
		System.out.println(stateCapital.containsKey("Goa"));
		System.out.println(stateCapital.containsKey("Telangana"));
		
		System.out.println(stateCapital.containsValue("Mumbai"));
		System.out.println(stateCapital.containsValue("Hyderabad"));
		
		System.out.println(stateCapital.keySet());
		
//		stateCapital.remove("Maharashtra");
//		
//		System.out.println(stateCapital);
		
		System.out.println(stateCapital.values());
		
		for ( String key  : stateCapital.keySet() ) {
			
			System.out.println(key + " - > " + stateCapital.get(key));
			
		}
		
	}

}
