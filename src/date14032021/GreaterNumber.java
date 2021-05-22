package date14032021;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int firstNum = obj.nextInt();
		System.out.println("Enter second number: ");
		int secondNum = obj.nextInt();
		System.out.println("Enter third number: ");
		int thirdNum = obj.nextInt();
				
//		if(firstNum>secondNum && firstNum>thirdNum) {
//			System.out.println("First number is greater than other two");
//		}
//		if(secondNum>thirdNum && secondNum>firstNum) {
//			System.out.println("Second number is greater than other two");
//		}
//		if(thirdNum>firstNum && thirdNum>secondNum) {
//			System.out.println("Third number is greater than other two");
//		}
		
		if(firstNum>secondNum && firstNum>thirdNum) {
			System.out.println("First number is greater");
		}
		else if(secondNum > thirdNum) {
			System.out.println("Second number is greater");
		}
		else {
			System.out.println("Third number is greater");
		}
		
		
		
		
		
		
	}

}
