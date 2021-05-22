package date10042021;

public class EncapsulationEx {
	
	private String name = "encapsulation";
	private int year = 2021;
	
	// getter method
	void getName() {
		System.out.println("name is: " + name);
	}
	
	// getter
	void getYear() {
		System.out.println("year is: " + year);
	}
	
	// setter 
	void setName(String iName) {
		name = iName;
	}
	
	// setter
	void setYear(int iYear) {
		year = iYear;
	}

}
