package date17042021;

public class CalculatorImplementation implements Calculator{

	public void add(int x, int y) {
		System.out.println("Addition is: " + (x+y));
	}
	
	public void sub(int x, int y) {
		System.out.println("Subtraction is: " + (x-y));
	}
	
	public void mult(int x, int y) {
		System.out.println("Multiplication is: " + (x*y));
	}
	
	public void div(int x, int y) {
		System.out.println("Division is: " + (x/y));
	}
	
}
