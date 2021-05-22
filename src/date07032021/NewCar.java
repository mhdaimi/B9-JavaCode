package date07032021;

public class NewCar {
	
	String company;
	String modelName;
	String color;
	int year;
	int numberOfGears;
	
	
	public NewCar(String inputCompany, String inputModel, String iColor, int iYear, int iGears) {
		company = inputCompany;
		modelName = inputModel;
		color = iColor;
		year = iYear;
		numberOfGears = iGears;		
	}
	
	
	public NewCar(String inputCompany, String inputModel, String iColor, int iYear) {
		numberOfGears=6;
		company = inputCompany;
		modelName = inputModel;
		color = iColor;
		year = iYear;
		
	}
	
	
	
	void displayCarDetails() {
		System.out.println("Company: " + company);
		System.out.println("name: " + modelName);
		System.out.println("color: " + color);
		System.out.println("year: " + year);
		System.out.println("gears: " + numberOfGears);
	}
		
	void startCar() {
		System.out.println(modelName + " is starting..");
	}
	
	void changeGear() {
		System.out.println("changing gear...");
	}
	
	void accelarate() {
		System.out.println("Car is accelarating..");
	}
	
	void stopCar() {
		System.out.println("Car si stopping...");
	}
	
	
	

}
