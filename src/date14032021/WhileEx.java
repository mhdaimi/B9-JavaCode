package date14032021;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		Scanner objStr = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num1 = obj.nextInt();
		
		System.out.println("Enter another number: ");
		int num2 = obj.nextInt();
		
		System.out.println("The addition is: " + (num1+num2));
		
		System.out.println("Do you want to continue (y/n)? ");
		String choice = objStr.nextLine();
		
		while(choice.equals("y")) {
			
			System.out.println("Enter a number: ");
			num1 = obj.nextInt();
			
			System.out.println("Enter another number: ");
			num2 = obj.nextInt();
			
			System.out.println("The addition is: " + (num1+num2));
			
			System.out.println("Do you want to continue (y/n)? ");
			choice = objStr.nextLine();
		}
		
		System.out.println("Exiting, you entered choice: " + choice);

	}

}
