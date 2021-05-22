package date07032021;

public class Car {
		
	String name = "Maruti Ciaz";
	String color = "Black";
	int year = 2021;
	int numberOfGears = 6;
	
	void displayCarDetails() {
		System.out.println("name: " + name);
		System.out.println("color: " + color);
		System.out.println("year: " + year);
		System.out.println("gears: " + numberOfGears);
	}
		
	void startCar() {
		System.out.println(name + " is starting..");
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
