package date11042021;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class ExecptionExample {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int firstNum = obj.nextInt();
		System.out.println("Enter a another number: ");
		int secondNum = obj.nextInt();
		try {	
			int result = firstNum/secondNum;
			System.out.println("The result of division is: " + result);
		} 
		catch (ArithmeticException e) {
			System.out.println("Exception occured");
		}
		
		System.out.println("program End");
		
		
//		File file = new File("C://Data//test.txt");
//		FileInputStream ip = new FileInputStream(file);
	}

}
