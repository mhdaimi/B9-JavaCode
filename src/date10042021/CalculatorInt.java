package date10042021;

public class CalculatorInt {
		
	int a;
	int b;
	
	public CalculatorInt(int m, int n) {
		a=m;
		b=n;
	}
		
	void add() {
		System.out.println("Addition: " + (a+b));
	}
		
	void sub() {
		System.out.println("Subtraction: " + (a-b));
	}

	void mult() {
		System.out.println("Multiplication: " + (a*b));
	}

	void division() {
		System.out.println("Division: " + (a/b));
	}
	
}
