package date18042021;

import java.util.ArrayList;
import java.util.Scanner;

public class GetUserValueAddToList {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		int i = 0;
		
		while(i < 5) {
			System.out.println("Enter an integer value: ");
			int value = obj.nextInt();
			numbers.add(value);
			i++;
		}
		
		System.out.println("You entered values: " + numbers);

	}

}
