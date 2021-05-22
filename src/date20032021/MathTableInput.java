package date20032021;

import java.util.Scanner;

public class MathTableInput {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		Scanner objStr = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = obj.nextInt();
		
		int i = 1;
		while(i <= 15) {
			System.out.println(num + " x " + i + " = " + num*i);
			i++;
		}
		
		System.out.println("Do you want to print table of another number (y/n) ?");
		String choice = objStr.nextLine();
		System.out.println("User choice: " + choice);
		
		while(choice.equals("y")) {
			
			System.out.println("Enter a number: ");
			num = obj.nextInt();
			i = 1;
			while(i <= 15) {
				System.out.println(num + " x " + i + " = " + num*i);
				i++;
			}
			
			System.out.println("Do you want to print table of another number (y/n) ?");
			choice = objStr.nextLine();
			System.out.println("User choice: " + choice);		
			
		}
	}

}
