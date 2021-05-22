package date10042021;

public class CalculatorFloat extends CalculatorInt {
	
	float c;
	float d;
	
	public CalculatorFloat(float x, float y, int u, int v) {
		super(u, v);
		c = x;
		d = y;	
	}
	
	void addFloat() {
		System.out.println("Addition: " + (c+d));
	}
		
	void subFloat() {
		System.out.println("Subtraction: " + (c-d));
	}

	void multFloat() {
		System.out.println("Multiplication: " + (c*d));
	}

	void divisionFloat() {
		System.out.println("Division: " + (c/d));
	}
	

}
