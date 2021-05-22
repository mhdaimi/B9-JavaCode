package date14032021;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = obj.nextLine();
		
		System.out.println("Enter your city pincode: ");
		int pincode = obj.nextInt();
		
		System.out.println("Hello, " + name);	
		System.out.println("You entered pin code: " + pincode);
		
		
		obj.close();
	}

}
 