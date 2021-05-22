package date11042021;

public class CalculatorExe {

	public static void main(String[] args) {

		CalculatorC calc = new CalculatorC();
		calc.add(20, 30);
		
		CalculatorP calcp = new CalculatorP();
		
		int result = calcp.add(10, 30);
		
		System.out.println(result);
		
	}

}
