package date21032021;

import java.util.Scanner;

public class SumOfInputNumbers {

	public static void main(String[] args) {

		int sum = 0;
		Scanner obj = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			System.out.println("Enter a number: ");
			int num = obj.nextInt();
			sum = sum + num;
		}
		
		System.out.println("Sum of numbers is: " + sum);
		
	}

}
