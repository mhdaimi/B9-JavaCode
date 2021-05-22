package date21032021;

import java.util.Scanner;

public class Difference21 {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int firstNum = obj.nextInt();
		
		if(firstNum > 21) {
			System.out.println("Double diference: " + 2*(firstNum-21));
		} else {
			System.out.println("Diference: " + (21-firstNum));
		}
		
		
		
	}

}
