package date21032021;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = obj.nextInt();
		
		int reverse = 0;
		int temp;
		int origNum = number;
		
		while(number>=1) {
			temp = number%10;
			reverse = reverse*10 + temp;
			number = number/10;			
		}
		
		System.out.println("Reverse of " + origNum + " is "+ reverse);
		
	}

}
