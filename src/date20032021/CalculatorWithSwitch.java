package date20032021;

import java.util.Scanner;

public class CalculatorWithSwitch {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		Scanner objStr = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int first = obj.nextInt();
		
		System.out.println("Enter second number: ");
		int second = obj.nextInt();
		
		System.out.println("Enter your choice (add/sub/mult/div): ");
		String choice = objStr.nextLine();
		
		switch(choice) {
		
		case "add": System.out.println("Addition is: " + (first + second));
			break;
		case "sub": System.out.println("Subtraction is: " + (first-second));
			//break;
		case "mult": System.out.println("Multiplication is: " + first*second);
			break;
		case "div": System.out.println("Division is: " + first/second);
			break;
		default: System.out.println("You entered invalid choice: " + choice);
		}
	}

}
