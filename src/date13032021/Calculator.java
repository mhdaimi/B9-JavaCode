package date13032021;

public class Calculator {
	
	int number1;
	int number2;
	
	
	public Calculator(int n1, int n2) {	
		number1 = n1;
		number2 = n2;
	}
	
	void add() {
		System.out.println("Addition is: " + (number1 + number2));
	}
	
	void subtract(int n1, int n2) {
		
		System.out.println("Subtraction is: " + (n1 - n2));
		System.out.println("Subtraction of Instance Var: " + (number1-number2));
		
		System.out.println("Subtraction number1 and n1: " + (number1 - n1));
		System.out.println("Subtraction number2 and n2: " + (number2 - n2));
	}
	
}
