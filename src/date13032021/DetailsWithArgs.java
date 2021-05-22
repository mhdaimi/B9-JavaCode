package date13032021;

public class DetailsWithArgs {
	
	
	void displayName(String fName, String lName) {
		
		System.out.println("My name is: " + fName + " " + lName);
	}
	
	void displayCity(String cityName, int pinCode) {
		System.out.println("I live in " + cityName + " city. Pincode: " + pinCode);
	}
	
	void displayLanguage(String lang) {
		System.out.println("I am learning " + lang);
	}
	
}
