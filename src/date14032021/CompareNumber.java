package date14032021;
import java.util.Scanner;

public class CompareNumber {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int first = obj.nextInt();
		System.out.println("Enter second number: ");
		int second = obj.nextInt();
		if(first>second) {
			System.out.println("First number is greater than second");
		}		
		if(second>first) {
			System.out.println("Second number is greater than first");
		}
		System.out.println("End of program...");
	}

}
