package date21032021;

public class FactorialFive {

	public static void main(String[] args) {

		int factorial = 1;
		
		for(int i=5; i>=1; i--) {
			factorial = factorial * i;
		}
		
		System.out.println("Factorial of 5 is:" + factorial);
		
	}

}
